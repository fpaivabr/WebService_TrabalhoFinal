package com.fernando_larissa.web_service.service;

import com.fernando_larissa.web_service.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario saveUsuario(Usuario usuario);
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(Long id);
    Usuario updateUsuario(Long id, Usuario usuarioDetails);
    void deleteUsuario(Long id);
}
