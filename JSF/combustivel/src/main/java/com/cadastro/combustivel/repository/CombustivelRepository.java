package com.cadastro.combustivel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.combustivel.model.Combustivel;

@Repository
public interface CombustivelRepository extends JpaRepository<Combustivel, Long> {
    List<Combustivel> findByTipo(String tipo);
}