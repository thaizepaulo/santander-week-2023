package me.dio.service.impl;

import me.dio.service.UsuarioService;
import me.dio.domain.model.Usuario;
import me.dio.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuario) {
        if (usuario.getId() != null &&
                usuarioRepository.existsById(usuario.getId())) {
            throw new IllegalArgumentException("Este usuário já existe.");
        }
        if (usuarioRepository.existsByContaNumero(usuario.getConta().getNumero())) {
            throw new IllegalArgumentException("Este número de conta já existe.");
        }
        return usuarioRepository.save(usuario);
    }
}
