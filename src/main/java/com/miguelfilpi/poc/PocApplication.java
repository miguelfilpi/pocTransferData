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
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SpringBootApplication
@EnableScheduling
public class PocApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

}

