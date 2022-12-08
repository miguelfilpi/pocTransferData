package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DW_OPERACIONAL_SERVICOS")
public class Servicos {

    @Column
    @SerializedName("Serviço")
    private String servico;
    @Column
    private String Fornecedor;
    @Column
    private int cdMovimento;
    @Id
    @Column
    private int cdOcsServico;

}
