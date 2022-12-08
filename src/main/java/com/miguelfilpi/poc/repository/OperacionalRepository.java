package com.miguelfilpi.poc.repository;

import com.miguelfilpi.poc.model.operacional.Operacional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionalRepository extends JpaRepository<Operacional,Integer> {
}
