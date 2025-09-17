package com.banco.desafio.agencia_api.service;

import org.springframework.stereotype.Service;

import com.banco.desafio.agencia_api.dto.AgenciaRequest;
import com.banco.desafio.agencia_api.model.Agencia;
import com.banco.desafio.agencia_api.repository.AgenciaRepository;

import java.util.List;

@Service
public class AgenciaService {

    private final AgenciaRepository repository;

    public AgenciaService(AgenciaRepository repository) {
        this.repository = repository;
    }

    public Agencia cadastrar(AgenciaRequest request) {
        Agencia agencia = Agencia.builder()
                .posX(request.getPosX())
                .posY(request.getPosY())
                .build();
        return repository.save(agencia);
    }

    public List<Agencia> listarTodas() {
        return repository.findAll();
    }
}