package com.miguelfilpi.poc.model.operacional;

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
@Table(name = "DM_CONTAINER")
public class Container implements Serializable {

    @Column
    private int Qtd;
    @Column
    private int cdMovimento;
    @Column
    @Id
    private int cdMovimentoEquipamento;
    @Column
    private String Container;
    @Column
    @SerializedName("Tipo de Carga")
    private String tipo_carga;
    @Column
    @SerializedName("FT armador")
    private int ft_armador;
    @Column
    @SerializedName("FT Nosso")
    private int ft_nosso;
    @Column
    private String Tara;
    @Column
    private double Temperatura;
    @Column
    private int TEUS;

}
