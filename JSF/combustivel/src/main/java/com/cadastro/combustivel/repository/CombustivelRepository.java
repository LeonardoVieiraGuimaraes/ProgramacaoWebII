package com.cadastro.combustivel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.combustivel.model.Combustivel;

@Repository
public interface CombustivelRepository extends JpaRepository<Combustivel, Long> {
    // Métodos personalizados, se necessário
}