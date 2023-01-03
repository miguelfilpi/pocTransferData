package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import com.miguelfilpi.poc.model.comercial.NCMs;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "DW_OPERACIONAL")
public class Operacional implements Serializable {

    @Column
    private String Processo;
    @Column
    @Id
    private int cdMovimento;
    @Column
    private int cdOferta;
    @Column
    private int cdTrafego;
    @Column
    @SerializedName("Validade frete")
    private String validade_frete;
    @Column
    @SerializedName("Data abertura")
    private String data_abertura;
    @Column
    @SerializedName("Data encerramento")
    private String data_encerramento;
    @Column
    private String Produto;
    @Column
    @Lob
    private String Cliente;
    @Column
    @Lob
    private String Ref_Pessoa;
    @Column
    @Lob
    private String Vendedor;
    @Column
    @Lob
    @SerializedName("Responsável comercial")
    private String Responsavel_comercial;
    @Column
    @Lob
    @SerializedName("Responsável operacional")
    private String responsavel_operacional;
    @Column
    @Lob
    private String Intermediario;
    @Column
    private String Pricing;
    @Column
    @Lob
    private String Armador;
    @Column
    @Lob
    private String Despachante;
    @Column
    @Lob
    private String Agente;
    @Column
    @Lob
    @SerializedName("Agente triangular")
    private String Agente_triangular;
    @Column
    @SerializedName("País de Origem")
    private String pais_origem;
    @Column
    private String Incoterm;
    @Column
    @SerializedName("Origem de carga")
    private String origem_carga;
    @Column
    private String Origem;
    @Column
    @Lob
    @SerializedName("Trade lane origem")
    private String trade_lane_origem;
    @Column
    private String Destino;
    @Column
    @Lob
    @SerializedName("Trade lane destino")
    private String trade_lane_destino;
    @Column
    private String Booking;
    @Column
    @SerializedName("Previsão de embarque Booking")
    private String previsao_embarque_booking;
    @Column
    @SerializedName("Previsão de chegada Booking")
    private String previsao_chegada_booking;
    @Column
    @SerializedName("Navio Feeder")
    private String navio_feeder;
    @Column
    @SerializedName("Viagem Feeder")
    private String viagem_feeder;
    @Column
    private String Master;
    @Column
    private String House;
    @Column
    private String Courier;
    @Column
    private String Navio;
    @Column
    private String Viagem;
    @Column
    @SerializedName("Navio Final")
    private String navio_final;
    @Column
    @SerializedName("Viagem Final")
    private String viagem_final;
    @Column
    @Lob
    private String Terminal;
    @Column
    @SerializedName("Prontidão de carga")
    private String prontidao_carga;
    @Column
    @SerializedName("Previsão de embarque (Feeder)")
    private String previsao_embarque_feeder;
    @Column
    @SerializedName("Confirmação de embarque (Feeder)")
    private String confirmacao_embarque_feeder;
    @Column
    @SerializedName("Previsão de embarque")
    private String previsao_embarque;
    @Column
    @SerializedName("Confirmação de embarque")
    private String confirmacao_embarque;
    @Column
    @SerializedName("Previsão de atracação")
    private String previsao_atracacao;
    @Column
    @SerializedName("Confirmação de atracação")
    private String confirmacao_atracacao;
    @Column
    @SerializedName("Data de desatracação")
    private String data_desatracacao;
    @Column
    @SerializedName("Data de DTA")
    private String data_de_dta;
    @Column
    @SerializedName("Destino DTA")
    private String destino_dta;
    @Column
    @SerializedName("Número DTA")
    private String numero_dta;
    @Column
    @SerializedName("Solicitação DTA")
    private String solicitacao_dta;
    @Column
    @SerializedName("Data de Pré-Aviso de Chegada")
    private String data_preaviso_chegada;
    @Column
    @SerializedName("Transit Time de (Dias)")
    private String transit_time_de_dias;
    @Column
    @SerializedName("Transit Time ate (Dias)")
    private String transit_time_ate_dias;
    @Column
    @SerializedName("Transit Time previsto (Dias)")
    private String transit_time_previsto_dias;
    @Column
    @SerializedName("Transit Time cumprido (Dias)")
    private String transit_time_cumprido_dias;
    @Column
    @Lob
    @SerializedName("Link para Restreio")
    private String link_rastreio;
    @Column

    @SerializedName("Data do link de rastreio")
    private String data_link_rastreio;
    @Column
    private double Teus;
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
    private String percentual_mc;
    @Column
    @Lob
    private String Voo;
    @Column
    @Lob
    @SerializedName("Recebimento de carga")
    private String recebimento_carga;
    @Column
    @Lob
    @SerializedName("Previsão de disponibilidade")
    private String previsao_disponibilidade;
    @Column
    @Lob
    @SerializedName("Autorização Carga")
    private String autorizacao_carga;
    @Column
    @Lob
    @SerializedName("Aprovação AWB")
    private String aprovacao_AWB;
    @Column
    @Lob
    @SerializedName("Doc. HAWB")
    private String doc_hawb;
    @Column
    @Lob
    @SerializedName("Previsão consolidada")
    private String previsao_consolidada;
    @Column
    @Lob
    @SerializedName("Previsão de saída")
    private String previsao_saida;
    @Column
    @Lob
    @SerializedName("Confirmação de saída")
    private String confirmacao_saida;
    @Column
    @Lob
    @SerializedName("Previsão de chegada")
    private String previsao_chegada;
    @Column
    @Lob
    @SerializedName("Confirmação de chegada MAWB")
    private String confirmacao_chegada_mawb;
    @Column
    @Lob
    @SerializedName("Confirmação de chegada HAWB")
    private String confirmacao_chegada_hawb;
    @Column
    @Lob
    @SerializedName("Envio da instrução de embarque")
    private String envio_instrucao_embarque;
    @Column
    @Lob
    @SerializedName("DTA Vinculada")
    private String dta_vinculada;
    @Column
    @Lob
    @SerializedName("DTA Concedida")
    private String dta_concedida;
    @Column
    @Lob
    @SerializedName("DTA Solicitada")
    private String dta_solicitada;
    @Column
    @Lob
    @SerializedName("Previsão de carregamento")
    private String previsão_carregamento;
    @Column
    @Lob
    @SerializedName("Confirmação de carregamento")
    private String confirmacao_carregamento;
    @Column
    @Lob
    @SerializedName("Confirmação conclusão trânsito")
    private String confirmacao_conclusao_transito;
    @Column
    @Lob
    @SerializedName("Responsabilidade TC4")
    private String responsabilidade_tc4;
    @Column
    @Lob
    @SerializedName("Envio responsabilidade TC4")
    private String envio_responsabilidade_tc4;
    @Column
    @Lob
    @SerializedName("Transito por conta da Cia Aérea")
    private String transito_cia_aerea;
    @Column
    @Lob
    @SerializedName("Previsão de prontidão de carga")
    private String previsao_prontidao_carga;
    @Column
    @Lob
    @SerializedName("Recebimento dos Documentos")
    private String recebimento_documentos;
    @Column
    @Lob
    @SerializedName("Responsável Desconsolidação")
    private String responsavel_desconsolidacao;
    @Column
    @Lob
    @SerializedName("CE Master")
    private String ce_master;
    @Column
    @Lob
    @SerializedName("CE House")
    private String ce_house;
    @Column
    @Lob
    @SerializedName("Data de emissão do Master")
    private String dt_emissao_master;
    @Column
    @Lob
    @SerializedName("Data de emissão do House")
    private String dt_emissao_house;

    @OneToMany(targetEntity = Container.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Container> Container;
    @OneToMany(targetEntity = Volumes.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Volumes> Volumes;
    @OneToMany(targetEntity = Servicos.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Servicos> Servicos;
    @OneToMany(targetEntity = NCMs.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<NCMs> NCMs;
    @OneToMany(targetEntity = Transbordo.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento", nullable = true)
    private Set<Transbordo> Transbordo;
    @OneToMany(targetEntity = Custos.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento", nullable = true)
    private Set<Custos> Custos;
    @Column
    @Lob
    @SerializedName("Tipo de frete")
    private String tipo_frete;
    @Column
    @Lob
    @SerializedName("Ref Agente")
    private String ref_agente;
    @Column
    @Lob
    private String Invoice;
    @Column
    @Lob
    @SerializedName("Purchase order")
    private String purchase_order;
    @Column
    @Lob
    private String Oferta;
    @Column
    @Lob
    @SerializedName("Motivo cancelamento")
    private String motivo_cancelamento;
    @Column
    @Lob
    @SerializedName("Documentação Finalizada")
    private String documentacao_finalizada;
    @Column
    @Lob
    @SerializedName("Responsável Documentação Finalizada")
    private String responsavel_documentacao_finalizada;
    @Column
    @Lob
    @SerializedName("Data Documentação Finalizada")
    private String data_documentacao_finalizada;
    @Column
    @Lob
    @SerializedName("Status Ocean insights")
    private String status_ocean_insights;
    @OneToMany(targetEntity = Agendas.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Agendas> Agendas;
    @Column
    @Lob
    private String Status;
    @Column
    private String Consignee;
    @Column
    @Lob
    private String Notify;
    @OneToMany(targetEntity = Importador.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Importador> Importador;
    @OneToMany(targetEntity = Exportador.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdMovimento", referencedColumnName = "cdMovimento")
    private Set<Exportador> Exportador;
    @Column
    @Lob
    @SerializedName("Moeda invoice")
    private String moeda_invoice;
    @Column
    @Lob
    @SerializedName("Valor invoice")
    private String valor_invoice;           //valor em STRING!
    @Column
    @Lob
    @SerializedName("MC REAL")
    private double mc_real;
    @Column
    @Lob
    @SerializedName("Profit agente")
    private String profit_agente;           //valor em STRING!
    @Column
    @SerializedName("Pagamento agente")
    private String pgto_agente;           //valor em STRING!
    @Column
    @SerializedName("Peso taxado (DIM total)")
    private String peso_taxado_dim_total;           //valor em STRING!
    @Column
    @SerializedName("Peso bruto")
    private String peso_bruto;           //valor em STRING!
    @Column
    @SerializedName("Debit/Credit")
    private String debito_credito;
    @Column
    @Lob
    @SerializedName("Encerramento Contábil")
    private String encerramento_contabil;
    @Column
    @Lob
    private String Recebimento;
    @Column
    @Lob
    private String Pagamento;
    @Column
    @SerializedName("Total de Entradas em BRL")
    private String total_entradas_BRL;           //valor em STRING!
    @Column
    @SerializedName("Total de Saídas em BRL")
    private String total_saidas_BRL;           //valor em STRING!
    @Column
    @SerializedName("Usuário abertura")
    private String usuario_abertura;
    @Column
    @SerializedName("Quantidade containers")
    private String qtd_containers;
    @Column
    private String dtUltimaAtualizacao;

}
