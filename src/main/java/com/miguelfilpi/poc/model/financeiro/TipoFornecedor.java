package com.miguelfilpi.poc.model.financeiro;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_TIPOFORNECEDOR")
public class TipoFornecedor {
    @Column
    private int cdPessoa;
    @Column
    @Id
    private int cdFinanceiro;
    @Column
    private String tipo;
}
