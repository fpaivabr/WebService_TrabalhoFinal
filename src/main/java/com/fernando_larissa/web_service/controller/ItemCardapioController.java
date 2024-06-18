package com.fernando_larissa.web_service.controller;

import com.fernando_larissa.web_service.model.ItemCardapio;
import com.fernando_larissa.web_service.service.ItemCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item-cardapio")
public class ItemCardapioController {

    @Autowired
    private ItemCardapioService itemCardapioService;

    @PostMapping
    public ItemCardapio createItemCardapio(@RequestBody ItemCardapio itemCardapio) {
        return itemCardapioService.saveItemCardapio(itemCardapio);
    }

    @GetMapping
    public List<ItemCardapio> getAllItemCardapios() {
        return itemCardapioService.getAllItemCardapios();
    }

    @GetMapping("/tipo/{tipo}")
    public List<ItemCardapio> getItemCardapiosByTipo(@PathVariable String tipo) {
        return itemCardapioService.getItemCardapiosByTipo(tipo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemCardapio> getItemCardapioById(@PathVariable Long id) {
        ItemCardapio itemCardapio = itemCardapioService.getItemCardapioById(id);
        return ResponseEntity.ok(itemCardapio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemCardapio> updateItemCardapio(@PathVariable Long id, @RequestBody ItemCardapio itemCardapioDetails) {
        ItemCardapio updatedItemCardapio = itemCardapioService.updateItemCardapio(id, itemCardapioDetails);
        return ResponseEntity.ok(updatedItemCardapio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemCardapio(@PathVariable Long id) {
        itemCardapioService.deleteItemCardapio(id);
        return ResponseEntity.noContent().build();
    }
}
