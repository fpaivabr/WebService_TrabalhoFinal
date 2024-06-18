package com.fernando_larissa.web_service.service.impl;

import com.fernando_larissa.web_service.exception.ResourceNotFoundException;
import com.fernando_larissa.web_service.model.Usuario;
import com.fernando_larissa.web_service.repository.UsuarioRepository;
import com.fernando_larissa.web_service.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario not found with id: " + id));
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuarioDetails) {
        Usuario usuario = getUsuarioById(id);
        usuario.setNomeUsuario(usuarioDetails.getNomeUsuario());
        usuario.setSobrenomeUsuario(usuarioDetails.getSobrenomeUsuario());
        usuario.setDescricaoUsuario(usuarioDetails.getDescricaoUsuario());
        usuario.setSenhaUsuario(usuarioDetails.getSenhaUsuario());
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        Usuario usuario = getUsuarioById(id);
        usuarioRepository.delete(usuario);
    }
}
