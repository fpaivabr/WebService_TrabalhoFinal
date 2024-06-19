package com.fernando_larissa.web_service.service.impl;

import com.fernando_larissa.web_service.exception.ResourceNotFoundException;
import com.fernando_larissa.web_service.model.Atividade;
import com.fernando_larissa.web_service.repository.AtividadeRepository;
import com.fernando_larissa.web_service.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeServiceImpl implements AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Override
    public List<Atividade> getAllAtividades() {
        return atividadeRepository.findAll();
    }

    @Override
    public List<Atividade> getAtividadesByStatus(String status) {
        return atividadeRepository.findByStatus(status);
    }

    @Override
    public Optional<Atividade> getAtividadeById(Long id) {
        return atividadeRepository.findById(id);
    }

    @Override
    public Atividade saveAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    @Override
    public void deleteAtividade(Long id) {
        atividadeRepository.deleteById(id);
    }

    @Override
    public Atividade updateAtividade(Long id, Atividade atividadeDetails) {
        Optional<Atividade> atividadeOptional = atividadeRepository.findById(id);
        if (atividadeOptional.isPresent()) {
            Atividade atividade = atividadeOptional.get();
            atividade.setTitulo(atividadeDetails.getTitulo());
            atividade.setDescricao(atividadeDetails.getDescricao());
            atividade.setData(atividadeDetails.getData());
            atividade.setStatus(atividadeDetails.getStatus());
            atividade.setAcao(atividadeDetails.getAcao());
            return atividadeRepository.save(atividade);
        }
        return null;
    }
}
