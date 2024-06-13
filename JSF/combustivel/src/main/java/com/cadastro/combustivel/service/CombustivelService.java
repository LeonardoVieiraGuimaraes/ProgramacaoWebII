package com.cadastro.combustivel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cadastro.combustivel.entity.Combustivel;
import com.cadastro.combustivel.repository.CombustivelRepository;

@Service
public class CombustivelService {

    private final CombustivelRepository combustivelRepository;

    public CombustivelService(CombustivelRepository combustivelRepository) {
        this.combustivelRepository = combustivelRepository;
    }

    public Combustivel salvarCombustivel(Combustivel combustivel) {
        return combustivelRepository.save(combustivel);
    }

    public List<Combustivel> listarTodos() {
        return combustivelRepository.findAll();
    }

    public Combustivel buscarPorId(Long id) {
        return combustivelRepository.findById(id).orElse(null);
    }

    public void deletarCombustivel(Long id) {
        combustivelRepository.deleteById(id);
    }
}