package me.dio.domain.service;

import me.dio.domain.model.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);
    Usuario create (Usuario usuario);
}
