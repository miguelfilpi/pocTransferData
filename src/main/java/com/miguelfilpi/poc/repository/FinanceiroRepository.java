package com.miguelfilpi.poc.repository;

import com.miguelfilpi.poc.model.financeiro.Financeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface FinanceiroRepository extends JpaRepository <Financeiro,Integer> {
}
