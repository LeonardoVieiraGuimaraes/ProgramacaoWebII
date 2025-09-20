package com.projeto.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calculator(Model model) {
        model.addAttribute("display", "");
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam String display, @RequestParam(required = false) String digit, 
                            @RequestParam(required = false) String operation, @RequestParam(required = false) String equals, Model model) {
        if (digit != null) {
            display += digit;
        } else if (operation != null) {
            display += " " + operation + " ";
        } else if (equals != null) {
            display = evaluate(display);
        }
        model.addAttribute("display", display);
        return "calculator";
    }

    private String evaluate(String expression) {
        System.out.println(expression); 
        return "Resultado";
    }
}