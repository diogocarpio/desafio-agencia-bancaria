package com.banco.desafio.agencia_api.controller;

import com.banco.desafio.agencia_api.dto.AgenciaRequest;
import com.banco.desafio.agencia_api.dto.DistanciaResponse;
import com.banco.desafio.agencia_api.model.Agencia;
import com.banco.desafio.agencia_api.service.AgenciaService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desafio")
public class AgenciaController {

    private final AgenciaService service;

    public AgenciaController(AgenciaService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Agencia> cadastrar(@Valid @RequestBody AgenciaRequest request) {
        Agencia agencia = service.cadastrar(request);
        return ResponseEntity.ok(agencia);
    }

    @GetMapping("/agencias")
    public ResponseEntity<List<Agencia>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/distancia")
    public ResponseEntity<List<DistanciaResponse>> calcularDistancia(
            @RequestParam double posX,
            @RequestParam double posY) {
        return ResponseEntity.ok(service.calcularDistancias(posX, posY));
    }
}