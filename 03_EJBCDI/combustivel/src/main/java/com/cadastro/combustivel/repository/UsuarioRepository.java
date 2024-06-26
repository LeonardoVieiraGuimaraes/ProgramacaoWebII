package com.cadastro.combustivel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.combustivel.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
