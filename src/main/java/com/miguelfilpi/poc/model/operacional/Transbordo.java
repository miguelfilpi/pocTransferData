package com.miguelfilpi.poc.model.operacional;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DW_TRANSBORDO")
public class Transbordo {

    @Column
    @SerializedName("Sequência")
    private int sequencia;
    @Column
    private String Porto;
    @Column
    private int cdMovimento;
    @Id
    @Column
    private int cdTrecho;

}
