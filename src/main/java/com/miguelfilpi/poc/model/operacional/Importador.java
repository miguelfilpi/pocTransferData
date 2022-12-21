package com.miguelfilpi.poc.model.operacional;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_IMPORTADOR")
public class Importador {
    @Id
    @Column
    private int cdMovimento;        // valor em STRING!
    @Column
    private String Pessoa;
}
