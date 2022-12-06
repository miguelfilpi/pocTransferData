package com.miguelfilpi.poc.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miguelfilpi.poc.model.financeiro.Financeiro;
import com.miguelfilpi.poc.repository.FinanceiroRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class TransferService {

    private static RequestBodyService requestBodyService = new RequestBodyService();
    private static RequestTokenService requestTokenService = new RequestTokenService();

    public String retrieveBearerToken() throws URISyntaxException, IOException, InterruptedException {
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(requestTokenService);
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://sistema.skychart.com.br/apiskyline-treinamento/api/IntegracaoBi/login"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        requestTokenService = gson.fromJson(postResponse.body(), RequestTokenService.class);
        return requestTokenService.getToken();
    }


    public void requisicaoComercial() throws URISyntaxException, IOException, InterruptedException {
        requestBodyService.setDtAberturaInicial("25/03/2022");
        requestBodyService.setDtAberturaFinal("27/03/2022");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(requestBodyService);
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://sistema.skychart.com.br/apiskyline-treinamento/api/IntegracaoBi/comercial"))
                .header("Authorization", "Bearer " + requestTokenService.getToken())
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponseComercial = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        //comercial = gson.fromJson(postResponseComercial.body(), Comercial.class);
        System.out.println(postResponseComercial.body());
    }

    public void requisicaoOperacional() throws URISyntaxException, IOException, InterruptedException {
        //requestBodyService.setDtAberturaInicial(dtAberturaInicial);
        //requestBodyService.setDtAberturaFinal(dtAberturaFinal);
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(requestBodyService);
        HttpRequest postRequestOperacional = HttpRequest.newBuilder()
                .uri(new URI("https://sistema.skychart.com.br/apiskyline-treinamento/api/IntegracaoBi/operacional"))
                .header("Authorization", "Bearer " + requestTokenService.getToken())
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpClient httpClientOperacional = HttpClient.newHttpClient();
        HttpResponse<String> postResponseOperacional = httpClientOperacional.send(postRequestOperacional, HttpResponse.BodyHandlers.ofString());
        System.out.println(postResponseOperacional.body());
    }

    public List<Financeiro> requisicaoFinanceiro(String token) throws IOException, InterruptedException, URISyntaxException {

        RequestBodyService requestBodyServiceFinanceiro = new RequestBodyService();
        requestBodyServiceFinanceiro.setDtAberturaInicial("22/02/2022");
        requestBodyServiceFinanceiro.setDtAberturaFinal("24/02/2022");

        Gson gsonFinanceiro = new Gson();
        String jsonResponseFinanceiro = gsonFinanceiro.toJson(requestBodyServiceFinanceiro);

        HttpRequest postRequestFinanceiro = HttpRequest.newBuilder()
                .uri(new URI("https://sistema.skychart.com.br/apiskyline-treinamento/api/IntegracaoBi/financeiro"))
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonResponseFinanceiro))
                .build();
        HttpClient httpClientFinanceiro = HttpClient.newHttpClient();

        HttpResponse<String> postResponseFinanceiro = httpClientFinanceiro.send(postRequestFinanceiro, HttpResponse.BodyHandlers.ofString());

        //Formatando a classe Financeiro para lista -> Json comeća com [ logo indica array
        Type collectionType = new TypeToken<List<Financeiro>>(){}.getType();
        List<Financeiro> enums = gsonFinanceiro.fromJson(postResponseFinanceiro.body(), collectionType);

        return enums;
    }

}
