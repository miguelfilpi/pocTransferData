package com.miguelfilpi.poc.model.operacional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DW_OPERACIONAL_EXPORTADOR")
public class Exportador {
    @Id
    private long id;
    @Column
    private String cdMovimento;          //valor em STRING!
    @Column
    private String Pessoa;
}
