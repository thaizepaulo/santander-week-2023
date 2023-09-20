package me.dio.domain.repository;

import me.dio.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByContaNumero(String contaNumero);
}
