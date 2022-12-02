package com.miguelfilpi.poc;

import com.miguelfilpi.poc.service.TransferService;

import java.io.IOException;
import java.net.URISyntaxException;

public class Teste {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        TransferService tf = new TransferService();
        tf.requisicaoFinanceiro(tf.retrieveBearerToken());
    }

}
