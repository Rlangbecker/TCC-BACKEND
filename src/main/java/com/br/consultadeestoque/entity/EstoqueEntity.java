package com.br.consultadeestoque.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "TB_EST_PRODUTO")
public class EstoqueEntity {

    @Id
    @Column(name = "ID_IDENTIFICADOR")
    private Integer idIdentificador;

    @Column(name = "DESC_CMPL")
    private String casaPeca;

    @Column(name = "REFERENCIA")
    private String referenciaPeca;

    @Column(name = "QTD_ATUAL")
    private Integer quantidadePeca;

    @Column(name = "COD_NCM")
    private String ncm;

    @Column(name = "CSOSN")
    private String csosn;

    @OneToMany(mappedBy = "estoque")
    private List<IdentificadorEntity> identificadores;

    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private GrupoEntity grupo;

    public List<IdentificadorEntity> getIdentificadores() {
        return identificadores;
    }

    public Integer getIdIdentificador() {
        return idIdentificador;
    }

    public String getCasaPeca() {
        return casaPeca;
    }

    public String getReferenciaPeca() {
        return referenciaPeca;
    }

    public Integer getQuantidadePeca() {
        return quantidadePeca;
    }

    public String getNcm() {
        return ncm;
    }

    public String getCsosn() {
        return csosn;
    }
}
