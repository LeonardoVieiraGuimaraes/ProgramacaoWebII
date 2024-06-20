package com.cadastro.combustivel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cadastro.combustivel.model.Combustivel;
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

    public List<Combustivel> buscarTodos() {
        return combustivelRepository.findAll();
    }

    public Combustivel buscarPorId(Long id) {
        return combustivelRepository.findById(id).orElse(null);
    }

    public void deletarCombustivel(Long id) {
        combustivelRepository.deleteById(id);
    }

    public boolean existePorId(Long id) {
        return combustivelRepository.existsById(id);
    }

    public List<Combustivel> buscarPorTipo(String tipo) {
        return combustivelRepository.findByTipo(tipo);
    }
}