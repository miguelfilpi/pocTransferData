package com.miguelfilpi.poc.service;

import com.miguelfilpi.poc.model.comercial.Comercial;
import com.miguelfilpi.poc.model.financeiro.Financeiro;
import com.miguelfilpi.poc.model.operacional.Operacional;
import com.miguelfilpi.poc.repository.ComercialRepository;
import com.miguelfilpi.poc.repository.FinanceiroRepository;
import com.miguelfilpi.poc.repository.OperacionalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ScheduleService {
    @Autowired
    FinanceiroRepository financeiroRepository;
    @Autowired
    OperacionalRepository operacionalRepository;
    @Autowired
    ComercialRepository comercialRepository;
    private static final Logger log = LoggerFactory.getLogger(ScheduleService.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() throws URISyntaxException, IOException, InterruptedException {
        List<Financeiro> financeiroList = new ArrayList<>();
        List<Operacional> operacionalList = new ArrayList<>();
        List<Comercial> comercialList = new ArrayList<>();
        TransferService ts = new TransferService();
        financeiroList = ts.requisicaoFinanceiro(ts.retrieveBearerToken());
        operacionalList = ts.requisicaoOperacional(ts.retrieveBearerToken());
        comercialList = ts.requisicaoComercial(ts.retrieveBearerToken());
        comercialRepository.flush();
        comercialRepository.saveAllAndFlush(comercialList);
        System.out.println("Comercial Salvo!");
        operacionalRepository.flush();
        operacionalRepository.saveAllAndFlush(operacionalList);
        System.out.println("Informaćão Operacional salva!");
        financeiroRepository.flush();
        financeiroRepository.saveAllAndFlush(financeiroList);
        System.out.println("Informaćão Financeiro salva!");
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
