package com.fernando_larissa.web_service.repository;

import com.fernando_larissa.web_service.model.ItemCardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemCardapioRepository extends JpaRepository<ItemCardapio, Long> {
    List<ItemCardapio> findByTipoItemCardapio(String tipo);
}


