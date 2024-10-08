package br.edu.fatec.franca.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/bomdia/{nome}")
    public String bomDia(@PathVariable String nome) {
        return "Tenha um bom dia " + nome;
    }

    @GetMapping("/boatarde/{nome}")
    public String boaTarde(@PathVariable String nome) {
        return "Tenha uma boa tarde " + nome;
    }

    @GetMapping("/boanoite/{nome}")
    public String boaNoite(@PathVariable String nome) {
        return "Tenha uma boa noite " + nome;
    }

}
