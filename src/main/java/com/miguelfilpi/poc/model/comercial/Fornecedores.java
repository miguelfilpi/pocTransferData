package com.miguelfilpi.poc.model.comercial;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_FORNECEDORES")
public class Fornecedores implements Serializable {
    @Column
    @SerializedName("Serviço")
    private String servico;
    @Column
    private String Fornecedor;
    @Column
    private int cdMovimento;
    @Column
    @Id
    private int cdOcsServico;
}
