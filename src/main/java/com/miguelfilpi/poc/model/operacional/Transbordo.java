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
@Table(name = "DM_TRANSBORDO")
public class Transbordo implements Serializable {

    @Column
    @SerializedName("Sequência")
    private int sequencia;
    @Column
    private String Porto;
    @Column
    private int cdMovimento;
    @Column
    @Id
    private int cdTrecho;

}
