package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DM_TRANSBORDO")
public class Transbordo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @SerializedName("Sequência")
    private int sequencia;
    @Column
    private String Porto;
    @Column
    private int cdMovimento;
    @Column
    private int cdTrecho;

}
