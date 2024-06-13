package com.cadastro.combustivel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cadastro.combustivel.entity.Combustivel;
import com.cadastro.combustivel.service.CombustivelService;


@Controller
public class CombustivelController {

    private final CombustivelService combustivelService;

    public CombustivelController(CombustivelService combustivelService) {
        this.combustivelService = combustivelService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/combustivel/cadastrar")
    public String formCadastrar() {
        return "formCombustivel";
    }

    @PostMapping("/cadastrar")
    public String submit(Combustivel combustivel) {
        combustivelService.salvarCombustivel(combustivel);
        return "redirect:/combustiveis";
    }

    @GetMapping("/combustiveis")
    public String listar(Model model) {
        model.addAttribute("combustiveis", combustivelService.listarTodos());
        return "combustiveis";
    }
}