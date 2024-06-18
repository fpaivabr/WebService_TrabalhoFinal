package com.fernando_larissa.web_service.service.impl;

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
            atividade.setTituloAtividade(atividadeDetails.getTituloAtividade());
            atividade.setDescricaoAtividade(atividadeDetails.getDescricaoAtividade());
            atividade.setDataAtividade(atividadeDetails.getDataAtividade());
            atividade.setStatusAtividade(atividadeDetails.getStatusAtividade());
            atividade.setAcaoRealizada(atividadeDetails.getAcaoRealizada());
            return atividadeRepository.save(atividade);
        }
        return null;
    }
}
