package com.project.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.formulario.model.Funcionario;
import com.project.formulario.services.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

  
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("funcionarios", funcionarioService.findAll());
        return "list";
    }


    @GetMapping("/formulario")
    public String showForm(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "form";
    }

    @PostMapping
    public String save(Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:/funcionarios";
    }
}