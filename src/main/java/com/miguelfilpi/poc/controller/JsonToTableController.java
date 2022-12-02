package com.miguelfilpi.poc.controller;


import com.miguelfilpi.poc.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JsonToTableController {

    @Autowired
    private FinanceiroRepository financeiroRepository;

   /* public List<Financeiro> saveFinanceiro() throws URISyntaxException, IOException, InterruptedException {

        TransferService tf = new TransferService();
        List<Financeiro> tabelaFinanceiro = tf.requisicaoFinanceiro(tf.retrieveBearerToken());
        Financeiro saveRegister = tabelaFinanceiro.stream().forEach(i->financeiroRepository.save(i));
    }*/
}
