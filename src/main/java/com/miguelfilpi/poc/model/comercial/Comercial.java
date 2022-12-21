package com.miguelfilpi.poc.model.comercial;

import com.google.gson.annotations.SerializedName;
import com.miguelfilpi.poc.model.operacional.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "DW_COMERCIAL")
public class Comercial {
    @Column
    private int Oferta;
    @Column
    private int cdOferta;
    @Id
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
    @OneToMany(targetEntity = Container.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Container> Container;
    @OneToMany(targetEntity = Volumes.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Volumes> Volumes;
    @OneToMany(targetEntity = Fornecedores.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Fornecedores> Fornecedores;
    @OneToMany(targetEntity = Transbordo.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Transbordo> Transbordo;
    @OneToMany(targetEntity = Custos.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Custos> Custos;
    @Column
    @SerializedName("Responsavel Inside sales")
    private String responsavel_inside_sales;
    @Column
    @SerializedName("Responsável pricing")
    private String responsavel_pricing;
    @Column
    @SerializedName("Responsável vendedor")
    private String responsavel_vendedor;
    @Column
    @SerializedName("Intermediário")
    private String intermediario;
    @Column
    @SerializedName("Tipo de cotação")
    private String tipo_cotacao;
    @Column
    private String Invoice;
    @Column
    @SerializedName("Referencia cliente")
    private String referencia_cliente;
    @Column
    @SerializedName("Referência Agente")
    private String referencia_agente;
    @Column
    @SerializedName("Purchase order")
    private String purchase_order;
    @Column
    @SerializedName("Solicitação")
    private String solicitacao;
    @OneToMany(targetEntity = NCMs.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<NCMs> NCMs;
    @OneToMany(targetEntity = Servicos.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Servicos> Servicos;
    @Column
    @SerializedName("Transit Time de")
    private String transit_time_de;
    @Column
    @SerializedName("Transit Time ate")
    private String transit_time_ate;
    @Column
    @SerializedName("Transit Time coleta de")
    private String transit_time_coleta_de;
    @Column
    @SerializedName("Transit Time coleta ate")
    private String transit_time_coleta_ate;
    @Column
    @SerializedName("Pais de entrega")
    private String pais_entrega;
    @Column
    @SerializedName("Cidade de entrega")
    private String cidade_entrega;
    @Column
    @SerializedName("Zipcode da Coleta")
    private String zipcode_coleta;
    @Column
    @SerializedName("Zipcode Entrega")
    private String zipcode_entrega;
    @Column
    @SerializedName("Observação de Rota (para cliente)")
    private String obs_rota_cliente;
    @Column
    private String Contrato;
    @Column
    private String Produto;
    @Column
    @SerializedName("Fornecedor frete")
    private String fornecedor_frete;
    @Column
    @SerializedName("Motivo não aprovação")
    private String motivo_nao_aprovacao;
    @Column
    @SerializedName("Data envio pricing")
    private String dt_envio_pricing;
    @Column
    @SerializedName("Data fim pricing")
    private String dt_fim_pricing;
    @Column
    @SerializedName("Usuário abertura")
    private String usuario_abertura;
    @Column
    private String dtUltimaAtualizacao;
}
