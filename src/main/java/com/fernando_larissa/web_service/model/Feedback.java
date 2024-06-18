package com.fernando_larissa.web_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_feedback;

    @Column(name = "titulo_feedback", nullable = false)
    private String tituloFeedback;

    @Column(name = "descricao_feedback")
    private String descricaoFeedback;

    @Column(name = "data_feedback", nullable = false)
    private Date dataFeedback;

    @Column(name = "status_feedback", nullable = false)
    private String statusFeedback;

    // Getters and Setters

    public Long getId_feedback() {
        return id_feedback;
    }

    public void setId_feedback(Long id_feedback) {
        this.id_feedback = id_feedback;
    }

    public String getTituloFeedback() {
        return tituloFeedback;
    }

    public void setTituloFeedback(String tituloFeedback) {
        this.tituloFeedback = tituloFeedback;
    }

    public String getDescricaoFeedback() {
        return descricaoFeedback;
    }

    public void setDescricaoFeedback(String descricaoFeedback) {
        this.descricaoFeedback = descricaoFeedback;
    }

    public Date getDataFeedback() {
        return dataFeedback;
    }

    public void setDataFeedback(Date dataFeedback) {
        this.dataFeedback = dataFeedback;
    }

    public String getStatusFeedback() {
        return statusFeedback;
    }

    public void setStatusFeedback(String statusFeedback) {
        this.statusFeedback = statusFeedback;
    }
}
