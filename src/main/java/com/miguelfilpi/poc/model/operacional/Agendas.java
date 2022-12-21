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
@Table(name = "DM_AGENDAS")
public class Agendas implements Serializable {

    @Column
    @Id
    private int cdMovimento;
    @Column
    private String Agenda;
    @Column
    @SerializedName("Data de cobrança")
    private String dt_cobranca;
    @Column
    @SerializedName("Responsável agenda")
    private String responsavel_agenda;

}
