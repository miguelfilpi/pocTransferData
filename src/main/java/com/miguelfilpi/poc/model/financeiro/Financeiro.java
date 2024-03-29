package com.miguelfilpi.poc.model.financeiro;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@DynamicUpdate
@Entity
@Table(name = "DW_FINANCEIRO")
public class Financeiro {

/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;*/
    @Column
    @SerializedName("Tipo financeiro")
    private String tipo_financeiro;
    @Column
    @Id
    private int cdFinanceiro;
    @Column
    private String Administrativo;
    @Column
    private String Fatura;
    @Column
    private String Sacado;
    @Column
    private String DS_STATUS_FATURA;
    @Column
    @SerializedName("Data emissão")
    private String data_emissao;
    @Column
    @SerializedName("Data vencimento")
    private String data_vencimento;
    @Column
    @SerializedName("Previsão de pagamento")
    private String previsao_pagamento;
    @Column
    private String Conta;
    @Column
    @SerializedName("Empresa nota fiscal")
    private String empresa_nota_fiscal;
    @Column
    @SerializedName("ISS (%)")
    private String iss_porcentagem;
    @Column
    private String Moeda;
    @Column
    @SerializedName("Total bruto")
    private double total_bruto;
    @Column
    private String Desconto;
    @Column
    @SerializedName("Tipo de desconto")
    private String tipo_de_desconto;
    @Column
    @SerializedName("Valor IRRF")
    private double valor_IRRF;
    @Column
    private String ISS;
    @Column
    @SerializedName("Total liquido")
    private double total_liquido;
    @Column
    @SerializedName("Total tributado")
    private double total_tributado;
    @Column
    private String Vendedor;
    @Column
    @SerializedName("Conta Contábil")
    private String conta_contabil;
    @Column
    @SerializedName("Forma pagamento")
    private String forma_pagamento;
    @Column
    private String juros;
    @Column
    @SerializedName("Tipo de de juros")
    private String tipo_de_juros;
    @Column
    private String INSS;
    @Column
    private String PIS;
    @Column
    private String CSLL;
    @Column
    private String IR;
    @Column
    private Integer cdMovimento;

    @OneToMany(targetEntity = Itens.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdFinanceiro", referencedColumnName = "cdFinanceiro")
    private Set<Itens> Itens = new HashSet<Itens>();

    @OneToMany(targetEntity = Recebimento.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdFinanceiro", referencedColumnName = "cdFinanceiro")
    private List<Recebimento> Recebimento;

    @OneToMany(targetEntity = TipoFornecedor.class, cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "cdFinanceiro", referencedColumnName = "cdFinanceiro")
    private List<TipoFornecedor> TipoFornecedor;
    @Column
    private String dtUltimaAtualizacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Financeiro that)) return false;
        return cdFinanceiro == that.cdFinanceiro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdFinanceiro);
    }
}
