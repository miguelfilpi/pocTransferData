package com.miguelfilpi.poc.repository;

import com.miguelfilpi.poc.model.comercial.Comercial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComercialRepository extends JpaRepository<Comercial,Integer> {

}
