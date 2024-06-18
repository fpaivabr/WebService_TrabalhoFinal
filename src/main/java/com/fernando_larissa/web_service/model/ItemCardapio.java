package com.fernando_larissa.web_service.model;


import jakarta.persistence.*;

@Entity
@Table(name = "item_cardapio")
public class ItemCardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cardapio;

    @Column(name = "titulo_cardapio", nullable = false)
    private String tituloCardapio;

    @Column(name = "descricao_cardapio")
    private String descricaoCardapio;

    @Column(name = "tipo_item_cardapio", nullable = false)
    private String tipoItemCardapio;

    // Getters and Setters

    public Long getId_cardapio() {
        return id_cardapio;
    }

    public void setId_cardapio(Long id_cardapio) {
        this.id_cardapio = id_cardapio;
    }

    public String getTituloCardapio() {
        return tituloCardapio;
    }

    public void setTituloCardapio(String tituloCardapio) {
        this.tituloCardapio = tituloCardapio;
    }

    public String getDescricaoCardapio() {
        return descricaoCardapio;
    }

    public void setDescricaoCardapio(String descricaoCardapio) {
        this.descricaoCardapio = descricaoCardapio;
    }

    public String getTipoItemCardapio() {
        return tipoItemCardapio;
    }

    public void setTipoItemCardapio(String tipoItemCardapio) {
        this.tipoItemCardapio = tipoItemCardapio;
    }
}
