package com.miguelfilpi.poc.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Component;

@Component
public class ComercialDAO {
    private EntityManagerFactory factory;

    public EntityManagerFactory getEntityManagerFactory(){
        if(factory==null){
            factory = Persistence.createEntityManagerFactory("delphi");
        }
        return factory;
    }

    public EntityManager getEntityManager(){
        return getEntityManagerFactory().createEntityManager();
    }
}
