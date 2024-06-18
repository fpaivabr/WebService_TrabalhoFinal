package com.fernando_larissa.web_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtividade;

    @Column(name = "titulo_atividade")
    private String tituloAtividade;

    @Column(name = "descricao_atividade")
    private String descricaoAtividade;

    @Column(name = "data_atividade")
    private String dataAtividade;

    @Column(name = "status_atividade")
    private String statusAtividade;

    @Column(name = "acao_realizada")
    private String acaoRealizada; // Ação realizada

    // Construtor, getters e setters

    public Atividade() {
    }

    public Long getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getTituloAtividade() {
        return tituloAtividade;
    }

    public void setTituloAtividade(String tituloAtividade) {
        this.tituloAtividade = tituloAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public String getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(String dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    public String getStatusAtividade() {
        return statusAtividade;
    }

    public void setStatusAtividade(String statusAtividade) {
        this.statusAtividade = statusAtividade;
    }

    public String getAcaoRealizada() {
        return acaoRealizada;
    }

    public void setAcaoRealizada(String acaoRealizada) {
        this.acaoRealizada = acaoRealizada;
    }
}
