package com.chavier.luci_modas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // caminho relativo dentro de templates
    }

    @GetMapping("/producao")
    public String producao() {
        return "paginas/producao";
    }

    @GetMapping("/relatorio")
    public String relatorio() {
        return "paginas/relatorio";
    }

    @GetMapping("/galeria")
    public String galeria() {
        return "paginas/galeria";
    }

    @GetMapping("/login")
    public String login() {
        return "paginas/login";
    }
}