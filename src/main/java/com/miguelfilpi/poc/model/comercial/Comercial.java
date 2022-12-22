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
    @Lob
    private String Cliente;
    @Column
    @Lob
    @SerializedName("Data abertura")
    private String dt_abertura;
    @Column
    @Lob
    @SerializedName("Validade de")
    private String validade_de;
    @Column
    @Lob
    @SerializedName("Validade até")
    private String validade_ate;
    @Column
    @Lob
    @SerializedName("País de Origem")
    private String pais_origem;
    @Column
    @Lob
    private String Incoterm;
    @Column
    @Lob
    @SerializedName("Origem de carga")
    private String origem_carga;
    @Column
    @Lob
    @SerializedName("Porto de Origem")
    private String porto_origem;
    @Column
    @Lob
    private String Destino;
    @Column
    @Lob
    @SerializedName("Moeda CIF")
    private String moeda_cif;
    @Column
    @SerializedName("Valor CIF")
    private double valor_cif;
    @Column
    @Lob
    @SerializedName("Moeda nota fiscal")
    private String moeda_nf;
    @Column
    @SerializedName("Valor nota fiscal")
    private double valor_nf;
    @Column
    @Lob
    @SerializedName("Frequência")
    private String frequencia;
    @Column
    @Lob
    @SerializedName("BL direto")
    private String bl_direto;
    @Column
    @Lob
    @SerializedName("Transit Time")
    private String transit_time;
    @Column
    @Lob
    @SerializedName("Histórico")
    private String historico;
    @Column
    @Lob
    @SerializedName("Numero Spot")
    private String numero_spot;
    @Column
    @Lob
    private String Agente;
    @Column
    @Lob
    @SerializedName("Agente Triangular")
    private String agente_triangular;
    @Column
    @SerializedName("Numero da rota")
    private int numero_rota;
    @Column
    @Lob
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
    @Lob
    @SerializedName("Tipo Profit (Agente)")
    private String tipo_profit_agente;
    @Column
    @SerializedName("Total Profit (Agente)")
    private double total_profit_agente;
    @Column
    @Lob
    @SerializedName("Tipo Profit (Agente Triangular)")
    private String tipo_profit_agente_triangular;
    @Column
    @SerializedName("Total Profit (Agente Triangular)")
    private double total_profit_agente_triangular;
    @Column
    @Lob
    @SerializedName("Moeda MC")
    private String moeda_mc;
    @Column
    @SerializedName("Valor MC")
    private double valor_mc;
    @Column
    @Lob
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
    @Lob
    @SerializedName("Responsavel Inside sales")
    private String responsavel_inside_sales;
    @Column
    @Lob
    @SerializedName("Responsável pricing")
    private String responsavel_pricing;
    @Column
    @Lob
    @SerializedName("Responsável vendedor")
    private String responsavel_vendedor;
    @Column
    @Lob
    @SerializedName("Intermediário")
    private String intermediario;
    @Column
    @Lob
    @SerializedName("Tipo de cotação")
    private String tipo_cotacao;
    @Column
    @Lob
    private String Invoice;
    @Column
    @Lob
    @SerializedName("Referencia cliente")
    private String referencia_cliente;
    @Column
    @Lob
    @SerializedName("Referência Agente")
    private String referencia_agente;
    @Column
    @Lob
    @SerializedName("Purchase order")
    private String purchase_order;
    @Column
    @Lob
    @SerializedName("Solicitação")
    private String solicitacao;
    @OneToMany(targetEntity = NCMs.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<NCMs> NCMs;
    @OneToMany(targetEntity = Servicos.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private List<Servicos> Servicos;
    @Column
    @Lob
    @SerializedName("Transit Time de")
    private String transit_time_de;
    @Column
    @Lob
    @SerializedName("Transit Time ate")
    private String transit_time_ate;
    @Column
    @Lob
    @SerializedName("Transit Time coleta de")
    private String transit_time_coleta_de;
    @Column
    @Lob
    @SerializedName("Transit Time coleta ate")
    private String transit_time_coleta_ate;
    @Column
    @Lob
    @SerializedName("Pais de entrega")
    private String pais_entrega;
    @Column
    @Lob
    @SerializedName("Cidade de entrega")
    private String cidade_entrega;
    @Column
    @Lob
    @SerializedName("Zipcode da Coleta")
    private String zipcode_coleta;
    @Column
    @Lob
    @SerializedName("Zipcode Entrega")
    private String zipcode_entrega;
    @Column(length = 100000)
    @Lob
    @SerializedName("Observação de Rota (para cliente)")
    private String obs_rota_cliente;
    @Column
    @Lob
    private String Contrato;
    @Column
    @Lob
    private String Produto;
    @Column
    @Lob
    @SerializedName("Fornecedor frete")
    private String fornecedor_frete;
    @Column
    @Lob
    @SerializedName("Motivo não aprovação")
    private String motivo_nao_aprovacao;
    @Column
    @Lob
    @SerializedName("Data envio pricing")
    private String dt_envio_pricing;
    @Column
    @Lob
    @SerializedName("Data fim pricing")
    private String dt_fim_pricing;
    @Column
    @Lob
    @SerializedName("Usuário abertura")
    private String usuario_abertura;
    @Column
    @Lob
    private String dtUltimaAtualizacao;
}
