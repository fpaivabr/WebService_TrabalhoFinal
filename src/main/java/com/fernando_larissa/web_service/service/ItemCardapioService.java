package com.fernando_larissa.web_service.service;

import com.fernando_larissa.web_service.model.ItemCardapio;

import java.util.List;

public interface ItemCardapioService {
    ItemCardapio saveItemCardapio(ItemCardapio itemCardapio);
    List<ItemCardapio> getAllItemCardapios();
    List<ItemCardapio> getItemCardapiosByTipo(String tipo);
    ItemCardapio getItemCardapioById(Long id);
    ItemCardapio updateItemCardapio(Long id, ItemCardapio itemCardapioDetails);
    void deleteItemCardapio(Long id);
}
