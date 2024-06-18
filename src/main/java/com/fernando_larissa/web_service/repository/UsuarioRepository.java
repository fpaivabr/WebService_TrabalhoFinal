package com.fernando_larissa.web_service.repository;

import com.fernando_larissa.web_service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos adicionais de consulta se necessário
}

