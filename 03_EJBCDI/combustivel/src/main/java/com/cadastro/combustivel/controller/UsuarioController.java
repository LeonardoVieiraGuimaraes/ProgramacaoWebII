package com.cadastro.combustivel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cadastro.combustivel.model.Usuario;
import com.cadastro.combustivel.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView("cadastroUsuario");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @PostMapping("/salvar")
    public String salvar(Usuario usuario) {
        usuarioService.salvar(usuario);
        return "redirect:/login";
    }
}