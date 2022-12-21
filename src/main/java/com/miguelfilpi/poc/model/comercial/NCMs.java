package com.miguelfilpi.poc.model.comercial;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_NCM")
public class NCMs implements Serializable {
    @Column
    private String ncm;
    @Column
    private int cdMovimento;
    @Column
    @Id
    private int cdMovimentoNcm;
}
