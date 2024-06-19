package com.fernando_larissa.web_service.service;

import com.fernando_larissa.web_service.model.Atividade;

import java.util.List;
import java.util.Optional;

public interface AtividadeService {
    List<Atividade> getAllAtividades();
    List<Atividade> getAtividadesByStatus(String status);
    Optional<Atividade> getAtividadeById(Long id);
    Atividade saveAtividade(Atividade atividade);
    void deleteAtividade(Long id);
    Atividade updateAtividade(Long id, Atividade atividadeDetails);
}
