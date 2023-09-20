package me.dio.domain.repository;

import me.dio.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {
}
