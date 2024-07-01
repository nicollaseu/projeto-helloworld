package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/task1")
    public class HelloWorldController {

    @GetMapping
        public String helloWorld() {
        return "Hello World!!!";
    }

    @GetMapping("/bsm")
        public String BsmGeneration() {
        return "Mentalidade de Crescimento (Growth Mindset)\n" +
               "Responsabildade Pessoal (Personal Responsability)\n" +
               "Orientação ao Futuro (Future Orientation)\n" +
               "Comunicação (Communication)\n" +
               "Trabalho em Equipe (Teamwork)\n" +
               "Pensamento Crítico (Critical Thinking)\n" +
               "Resolução de Problemas (Problem Solving)\n" +
               "Orientação para Resultados (Results Orientation)\n" +
               "Gerenciamento de Tempo (Time Management)\n" +
               "Adaptabilidade (Adaptability)\n" +
               "Autoconfiança (Self-Confidence)\n" +
               "Ética e Integridade (Ethics and Integrity)";
    }

}
