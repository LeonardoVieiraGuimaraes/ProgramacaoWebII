package com.project.formulario1.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormularioController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("formularioMB", new FormularioMB());
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam("nome") String nome, Model model) {
        FormularioMB formularioMB = new FormularioMB();
        formularioMB.setNome(nome);
        model.addAttribute("formularioMB", formularioMB);
        return "result";
    }
}
