package com.miguelfilpi.poc.model.comercial;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DM_FORNECEDORES")
public class Fornecedores implements Serializable {
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

}
