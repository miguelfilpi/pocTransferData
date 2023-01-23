package com.miguelfilpi.poc.model.comercial;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "DM_SERVICOS_COM")
public class ServicosComercial implements Serializable {
    @Column
    private String servico;
    @Column
    private int cdOferta;
    @Id
    @Column
    private int cdOfertaServico;
}
