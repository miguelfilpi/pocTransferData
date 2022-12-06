package com.miguelfilpi.poc.repository;

import com.miguelfilpi.poc.model.financeiro.Financeiro;
import org.springframework.data.repository.CrudRepository;

public interface FinanceiroRepository extends CrudRepository<Financeiro, Integer> {

}
