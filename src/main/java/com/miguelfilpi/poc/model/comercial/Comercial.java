package com.miguelfilpi.poc.model.comercial;

import com.google.gson.annotations.SerializedName;
import com.miguelfilpi.poc.model.operacional.Container;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DW_COMERCIAL")
public class Comercial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int Oferta;
    @Column
    private int cdOferta;
    @Column
    private int cdMovimento;
    @Column
    private String Cliente;
    @Column
    @SerializedName("Data abertura")
    private String dt_abertura;
    @Column
    @SerializedName("Validade de")
    private String validade_de;
    @Column
    @SerializedName("Validade até")
    private String validade_ate;
    @Column
    @SerializedName("País de Origem")
    private String pais_origem;
    @Column
    private String Incoterm;
    @Column
    @SerializedName("Origem de carga")
    private String origem_carga;
    @Column
    @SerializedName("Porto de Origem")
    private String porto_origem;
    @Column
    private String Destino;
    @Column
    @SerializedName("Moeda CIF")
    private String moeda_cif;
    @Column
    @SerializedName("Valor CIF")
    private double valor_cif;
    @Column
    @SerializedName("Moeda nota fiscal")
    private String moeda_nf;
    @Column
    @SerializedName("Valor nota fiscal")
    private double valor_nf;
    @Column
    @SerializedName("Frequência")
    private String frequencia;
    @Column
    @SerializedName("BL direto")
    private String bl_direto;
    @Column
    @SerializedName("Transit Time")
    private String transit_time;
    @Column
    @SerializedName("Histórico")
    private String historico;
    @Column
    @SerializedName("Numero Spot")
    private String numero_spot;
    @Column
    private String Agente;
    @Column
    @SerializedName("Agente Triangular")
    private String agente_triangular;
    @Column
    @SerializedName("Numero da rota")
    private int numero_rota;
    @Column
    private String Analise;
    @Column
    @SerializedName("Compra Frete")
    private double compra_frete;
    @Column
    @SerializedName("Compra Origem")
    private double compra_origem;
    @Column
    @SerializedName("Compra Subtotal")
    private double compra_subtotal;
    @Column
    @SerializedName("Compra Destino")
    private double compra_destino;
    @Column
    @SerializedName("Compra Total")
    private double compra_total;
    @Column
    @SerializedName("Venda Frete")
    private double venda_frete;
    @Column
    @SerializedName("Venda Origem")
    private double venda_origem;
    @Column
    @SerializedName("Venda Subtotal")
    private double venda_subtotal;
    @Column
    @SerializedName("Venda Destino")
    private double venda_destino;
    @Column
    @SerializedName("Venda Total")
    private double venda_total;
    @Column
    @SerializedName("Tipo Profit (Agente)")
    private String tipo_profit_agente;
    @Column
    @SerializedName("Total Profit (Agente)")
    private double total_profit_agente;
    @Column
    @SerializedName("Tipo Profit (Agente Triangular)")
    private String tipo_profit_agente_triangular;
    @Column
    @SerializedName("Total Profit (Agente Triangular)")
    private double total_profit_agente_triangular;
    @Column
    @SerializedName("Moeda MC")
    private String moeda_mc;
    @Column
    @SerializedName("Valor MC")
    private double valor_mc;
    @Column
    @SerializedName("Percentual MC")
    private String percentual_MC;                      //VALOR EM STRING!
    @OneToMany(targetEntity = Container.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Container> Container;


}
