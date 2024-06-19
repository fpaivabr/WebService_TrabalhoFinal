package com.fernando_larissa.web_service.repository;

import com.fernando_larissa.web_service.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByStatus(String status);
}
