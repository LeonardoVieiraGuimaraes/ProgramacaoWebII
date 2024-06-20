package com.cadastro.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return "listUsuario"; // Nome do arquivo HTML da lista de usuários
    }

    // Método para exibir o formulário de criação de um novo usuário
    @GetMapping("/usuario/novo")
    public String mostrarFormularioDeCadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "formUsuario";
    }
    
    // Método para exibir o formulário de edição de um usuário existente
    @GetMapping("/usuario/editar/{id}")
    public String mostrarFormularioDeEdicao(@PathVariable("id") Long id, Model model) {
        Usuario usuario = usuarioService.buscarPorId(id);
        if (usuario != null) {
            model.addAttribute("usuario", usuario);
        } else {
            // Tratar o caso em que o usuário não é encontrado
            return "redirect:/usuario/lista";
        }
        return "formUsuario";
    }

    @PostMapping("/usuario/salvar")
    public String salvarUsuario(@ModelAttribute("usuario") Usuario usuario, RedirectAttributes redirectAttributes) {
        usuarioService.salvar(usuario);
        redirectAttributes.addFlashAttribute("mensagem", "Usuário salvo com sucesso!");
        return "redirect:/usuarios";
    }

    @GetMapping("/usuario/deletar/{id}")
    public String deletarUsuario(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        usuarioService.excluir(id);
        redirectAttributes.addFlashAttribute("mensagem", "Usuário deletado com sucesso!");
        return "redirect:/usuarios";
    }
}