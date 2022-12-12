package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_SERVICOS")
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @SerializedName("Serviço")
    private String servico;
    @Column
    private String Fornecedor;
    @Column
    private int cdMovimento;
    @Column
    private int cdOcsServico;
    @Column
    private int cdOferta;
    @Column
    private int cdOfertaServico;


}
