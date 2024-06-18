package com.fernando_larissa.web_service.controller;

import com.fernando_larissa.web_service.model.Atividade;
import com.fernando_larissa.web_service.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping
    public List<Atividade> getAllAtividades() {
        return atividadeService.getAllAtividades();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atividade> getAtividadeById(@PathVariable Long id) {
        Optional<Atividade> atividade = atividadeService.getAtividadeById(id);
        return atividade.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Atividade createAtividade(@RequestBody Atividade atividade) {
        return atividadeService.saveAtividade(atividade);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atividade> updateAtividade(@PathVariable Long id, @RequestBody Atividade atividadeDetails) {
        Atividade updatedAtividade = atividadeService.updateAtividade(id, atividadeDetails);
        if (updatedAtividade != null) {
            return ResponseEntity.ok(updatedAtividade);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAtividade(@PathVariable Long id) {
        atividadeService.deleteAtividade(id);
        return ResponseEntity.noContent().build();
    }
}
