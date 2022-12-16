package com.miguelfilpi.poc.model.comercial;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DM_NCM")
public class NCMs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String ncm;
    @Column
    private int cdMovimento;
    @Column
    private int cdMovimentoNcm;
}
