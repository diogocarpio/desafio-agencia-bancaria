package com.banco.desafio.agencia_api.controller;

import com.banco.desafio.agencia_api.dto.AgenciaRequest;
import com.banco.desafio.agencia_api.model.Agencia;
import com.banco.desafio.agencia_api.service.AgenciaService;
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
    public ResponseEntity<Agencia> cadastrar(@RequestBody AgenciaRequest request) {
        Agencia agencia = service.cadastrar(request);
        return ResponseEntity.ok(agencia);
    }

    @GetMapping("/agencias")
    public ResponseEntity<List<Agencia>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }
}