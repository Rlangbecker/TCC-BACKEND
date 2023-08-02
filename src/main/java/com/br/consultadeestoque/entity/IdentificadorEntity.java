package com.br.consultadeestoque.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_EST_IDENTIFICADOR")
public class IdentificadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identificador")
    private Long idIdentificador;

    @ManyToOne
    @JoinColumn(name = "id_estoque")
    private EstoqueEntity estoque;

    @Column(name = "chave")
    private String chave;

    @OneToOne
    @JoinColumn(name = "id_identificador")
    private PecaEntity peca;
    public Long getIdIdentificador() {
        return idIdentificador;
    }

    public EstoqueEntity getEstoque() {
        return estoque;
    }

    public String getChave() {
        return chave;
    }
}
