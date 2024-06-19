package com.fernando_larissa.web_service.service.impl;

import com.fernando_larissa.web_service.exception.ResourceNotFoundException;
import com.fernando_larissa.web_service.model.ItemCardapio;
import com.fernando_larissa.web_service.repository.ItemCardapioRepository;
import com.fernando_larissa.web_service.service.ItemCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCardapioServiceImpl implements ItemCardapioService {

    @Autowired
    private ItemCardapioRepository itemCardapioRepository;

    @Override
    public ItemCardapio saveItemCardapio(ItemCardapio itemCardapio) {
        return itemCardapioRepository.save(itemCardapio);
    }

    @Override
    public List<ItemCardapio> getAllItemCardapios() {
        return itemCardapioRepository.findAll();
    }

    @Override
    public List<ItemCardapio> getItemCardapiosByTipo(String tipo) {
        return itemCardapioRepository.findByTipo(tipo);
    }

    @Override
    public ItemCardapio getItemCardapioById(Long id) {
        return itemCardapioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ItemCardapio not found with id: " + id));
    }

    @Override
    public ItemCardapio updateItemCardapio(Long id, ItemCardapio itemCardapioDetails) {
        ItemCardapio itemCardapio = getItemCardapioById(id);
        itemCardapio.setTituloCardapio(itemCardapioDetails.getTituloCardapio());
        itemCardapio.setDescricaoCardapio(itemCardapioDetails.getDescricaoCardapio());
        itemCardapio.setTipoItemCardapio(itemCardapioDetails.getTipoItemCardapio());
        return itemCardapioRepository.save(itemCardapio);
    }

    @Override
    public void deleteItemCardapio(Long id) {
        ItemCardapio itemCardapio = getItemCardapioById(id);
        itemCardapioRepository.delete(itemCardapio);
    }
}
