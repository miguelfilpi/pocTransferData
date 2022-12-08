package com.miguelfilpi.poc.repository;

import com.miguelfilpi.poc.model.financeiro.Financeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceiroRepository extends JpaRepository<Financeiro, Integer> {


}
