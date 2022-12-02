package com.miguelfilpi.poc.model.financeiro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TipoFornecedor {

    @Id
    private long id;
    @Column
    private int cdPessoa;
    @Column
    private int cdFinanceiro;
    @Column
    private String tipo;

}
