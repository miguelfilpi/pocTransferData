package com.miguelfilpi.poc;

import com.miguelfilpi.poc.controller.JsonToTableController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class PocApplication {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		SpringApplication.run(PocApplication.class, args);

		JsonToTableController jtt = new JsonToTableController();
		//jtt.saveFinanceiro();
	}

}

