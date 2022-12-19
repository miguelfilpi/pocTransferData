package com.miguelfilpi.poc;

import com.miguelfilpi.poc.model.comercial.Comercial;
import com.miguelfilpi.poc.model.financeiro.Financeiro;
import com.miguelfilpi.poc.model.operacional.Operacional;
import com.miguelfilpi.poc.repository.ComercialRepository;
import com.miguelfilpi.poc.repository.FinanceiroRepository;
import com.miguelfilpi.poc.repository.OperacionalRepository;
import com.miguelfilpi.poc.service.TransferService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.provider.HibernateUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SpringBootApplication
public class PocApplication implements CommandLineRunner {

	@Autowired
	FinanceiroRepository financeiroRepository;
	@Autowired
	OperacionalRepository operacionalRepository;
	@Autowired
	ComercialRepository comercialRepository;


	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		List<Financeiro> financeiroList = new ArrayList<>();
		List<Operacional> operacionalList = new ArrayList<>();
		List<Comercial> comercialList = new ArrayList<>();
		TransferService ts = new TransferService();
		financeiroList = ts.requisicaoFinanceiro(ts.retrieveBearerToken());
		operacionalList = ts.requisicaoOperacional(ts.retrieveBearerToken());
		comercialList = ts.requisicaoComercial(ts.retrieveBearerToken());
		comercialRepository.saveAllAndFlush(comercialList);
		System.out.println("Comercial Salvo!");
		operacionalRepository.saveAllAndFlush(operacionalList);
		System.out.println("Informaćão Operacional salva!");
		financeiroRepository.saveAllAndFlush(financeiroList);
		System.out.println("Informaćão Financeiro salva!");

		/*Timer timer = new Timer();
		TimerTask tarefa = new TimerTask() {
			@Override
			public void run() {
				List<Financeiro> financeiroList = new ArrayList<>();
				List<Operacional> operacionalList = new ArrayList<>();
				List<Comercial> comercialList = new ArrayList<>();
				TransferService ts = new TransferService();
				try{
					financeiroList = ts.requisicaoFinanceiro(ts.retrieveBearerToken());
					operacionalList = ts.requisicaoOperacional(ts.retrieveBearerToken());
					comercialList = ts.requisicaoComercial(ts.retrieveBearerToken());
					comercialRepository.saveAllAndFlush(comercialList);
					System.out.println("Comercial Salvo!");
					operacionalRepository.saveAllAndFlush(operacionalList);
					System.out.println("Informaćão Operacional salva!");
					financeiroRepository.saveAllAndFlush(financeiroList);
					System.out.println("Informaćão Financeiro salva!");
				} catch (RuntimeException | URISyntaxException | IOException | InterruptedException e){
					e.printStackTrace();
				}
			}
		};
*/

	}


}

