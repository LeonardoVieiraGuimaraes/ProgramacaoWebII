package com.cadastro.combustivel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cadastro.combustivel.model.Combustivel;
import com.cadastro.combustivel.service.CombustivelService;


@Controller
@RequestMapping("/combustivel")
public class CombustivelController {

    private final CombustivelService combustivelService;

    public CombustivelController(CombustivelService combustivelService) {
        this.combustivelService = combustivelService;
    }

    // @GetMapping("/")
    // public String index() {
    //     return "index";
    // }

    @GetMapping("/cadastrar")
    public String formCadastrar() {
        return "formCombustivel";
    }

    @PostMapping("/salvar")
    public String submit(Combustivel combustivel) {
        combustivelService.salvarCombustivel(combustivel);
        return "redirect:/combustivel/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("combustiveis", combustivelService.listarTodos());
        return "listcombustivel";
    }

    @GetMapping("/listar/{id}")
    public String buscarPorId(@PathVariable Long id, Model model) {
        Combustivel combustivel = combustivelService.buscarPorId(id);
        if (combustivel != null) {
            model.addAttribute("combustiveis", combustivel);
            return "combustivel/listar"; // Nome da view a ser retornada
        } else {
            return "redirect:/combustivel/notFound"; // Redireciona para uma página de erro ou lista vazia, por exemplo
        }
    }
    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable("id") Long id, Model model) {
        Combustivel combustivel = combustivelService.buscarPorId(id);
        model.addAttribute("combustivel", combustivel);
        return "formCombustivel";
    }

    @PostMapping("/atualizar")
    public String atualizar(Combustivel combustivel) {
        combustivelService.salvarCombustivel(combustivel); // Assumindo que este método serve tanto para salvar quanto para atualizar
        return "redirect:/combustivel/listar";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        if (combustivelService.existePorId(id)) {
            combustivelService.deletarCombustivel(id);
            if (!combustivelService.existePorId(id)) {
                redirectAttributes.addFlashAttribute("mensagemSucesso", "Combustível deletado com sucesso.");
            } else {
                redirectAttributes.addFlashAttribute("mensagemErro", "Erro ao deletar combustível.");
            }
        } else {
            redirectAttributes.addFlashAttribute("mensagemErro", "Combustível não encontrado.");
        }
        return "redirect:/combustivel/listar";
    }
    
}