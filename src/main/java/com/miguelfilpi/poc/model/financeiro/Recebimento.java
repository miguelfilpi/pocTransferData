package com.miguelfilpi.poc.model.financeiro;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_RECEBIMENTO")
public class Recebimento {
    @Id
    private long id;
    @Column
    private String Conta;
    @Column
    @SerializedName("Data recebimento")
    private String dt_recebimento;
    @Column
    private String Moeda;
    @Column
    @SerializedName("Valor recebido")
    private double valor_recebido;
    @Column
    @SerializedName("Usuario Baixa")
    private String usuario_baixa;
    @Column
    @SerializedName("Data inserido")
    private String data_inserido;
    @Column(insertable=false, nullable=true)
    private int cdFinanceiro;
    @Column
    private int cdPagamento;

}
