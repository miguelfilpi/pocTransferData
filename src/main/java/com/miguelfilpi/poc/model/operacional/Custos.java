package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_CUSTOS")
public class Custos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int Ordem;
    @Column
    private String Taxa;
    @Column
    @SerializedName("Tipo de cobrança")
    private String tipo_cobranca;
    @Column
    private String Local;
    @Column
    private String Container;
    @Column
    @SerializedName("P/C (compra)")
    private String pc_compra;
    @Column
    @SerializedName("Moeda compra")
    private String moeda_compra;
    @Column
    @SerializedName("Total compra")
    private double total_compra;
    @Column
    @SerializedName("P/C (venda)")
    private String pc_venda;
    @Column
    @SerializedName("Moeda venda")
    private String moeda_venda;
    @Column
    @SerializedName("Total venda")
    private double total_venda;
    @Column
    private double Lucro;
    @Column
    private String Fornecedor;
    @Column
    private String Sacado;
    @Column
    private int cdMovimento;

    @Column
    private int cdCusto;
}
