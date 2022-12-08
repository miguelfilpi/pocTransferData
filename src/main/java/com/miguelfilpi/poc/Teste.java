package com.miguelfilpi.poc;

import com.miguelfilpi.poc.service.TransferService;

import java.io.IOException;
import java.net.URISyntaxException;

public class Teste {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        TransferService ts = new TransferService();
        ts.requisicaoComercial(ts.retrieveBearerToken());
        ts.requisicaoOperacional(ts.retrieveBearerToken());
    }
}
