package com.miguelfilpi.poc;

import com.miguelfilpi.poc.model.financeiro.Financeiro;
import com.miguelfilpi.poc.repository.FinanceiroRepository;
import com.miguelfilpi.poc.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PocApplication implements CommandLineRunner {

	@Autowired
	FinanceiroRepository financeiroRepository;


	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		List<Financeiro> financeiroList = new ArrayList<>();
		TransferService ts = new TransferService();
		financeiroList = ts.requisicaoFinanceiro(ts.retrieveBearerToken());
		financeiroRepository.saveAll(financeiroList);
		System.out.println("Informaćão Financeiro salva!");

	}
}

