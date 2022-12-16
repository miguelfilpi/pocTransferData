package com.miguelfilpi.poc.model.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_TIPOFORNECEDOR")
public class TipoFornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int cdPessoa;
    @Column(insertable=false, nullable=true)
    private int cdFinanceiro;
    @Column
    private String tipo;

}
