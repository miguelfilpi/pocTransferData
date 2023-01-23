package com.miguelfilpi.poc.model.financeiro;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_ITENS")
public class Itens {
    @Column
    private double Ordem;
    @Column
    private String Taxa;
    @Column
    private String Moeda;
    @Column
    private double Total;
    @Column
    @SerializedName("Taxa conversão")
    private double taxa_conversao;
    @Column
    @SerializedName("Total convertido")
    private double total_convertido;
    @Column
    private int cdFinanceiro;
    @Column
    @Id
    private int cdItem;
    @Column
    private int cdMovimento;
    @Column
    private String Tributavel;
    @Column
    @SerializedName("Numero nota")
    private String numero_nota;
    @Column
    @SerializedName("Data nota")
    private String data_nota;
    @Column
    private String Cliente;
    @Column
    private String Processo;
    @Column
    @SerializedName("Valor taxa")
    private double vlr_taxa;
    @Column
    private String Nota;
    @Column
    @SerializedName("Data emissão nota")
    private String dt_emissao_nota;
    @Column
    @SerializedName("Centro custo")
    private String centro_custo;
}
