package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DW_OPERACIONAL_VOLUMES")
public class Volumes {

    @Column
    private int Volume;
    @Column
    private int cdEquipamentoVolume;
    @Column
    private String Embalagem;
    @Column
    private String Marca;
    @Column
    @SerializedName("Contra marca")
    private String contra_marca;
    @Column
    @SerializedName("Peso Bruto")
    private double peso_bruto;
    @Column
    @SerializedName("Dim/CBM")
    private double dim_CBM;
    @Column
    @SerializedName("Peso Liquido")
    private double peso_liquido;
    @Column
    @SerializedName("Peso VGM")
    private double peso_vgm;
    @Id
    @Column
    private int cdMovimentoEquipamento;
    @Column
    private int cdMovimento;
    @Column
    @SerializedName("Un. Peso")
    private String unidade_peso;
    @Column
    private double Comprimento;
    @Column
    private double Largura;
    @Column
    private double Altura;
    @Column
    @SerializedName("Cubagem/Peso taxado")
    private double cubagem_peso_taxado;
    @Column
    @SerializedName("Un. Comprimento")
    private String unidade_comprimento;
}
