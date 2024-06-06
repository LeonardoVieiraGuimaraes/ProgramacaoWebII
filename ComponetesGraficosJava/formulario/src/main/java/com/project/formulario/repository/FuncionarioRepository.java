package com.project.formulario.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.project.formulario.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}