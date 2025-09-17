package com.banco.desafio.agencia_api.service;

import org.springframework.stereotype.Service;

import com.banco.desafio.agencia_api.dto.AgenciaRequest;
import com.banco.desafio.agencia_api.dto.DistanciaResponse;
import com.banco.desafio.agencia_api.model.Agencia;
import com.banco.desafio.agencia_api.repository.AgenciaRepository;
import com.banco.desafio.agencia_api.util.DistanciaUtil;

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

    public List<DistanciaResponse> calcularDistancias(double posX, double posY) {
    List<Agencia> agencias = repository.findAll();
    return agencias.stream()
            .map(agencia -> new DistanciaResponse(
                    "AGENCIA_" + agencia.getId(),
                    DistanciaUtil.calcularDistancia(posX, posY, agencia.getPosX(), agencia.getPosY())
            ))
            .sorted((d1, d2) -> Double.compare(d1.getDistancia(), d2.getDistancia()))
            .toList();
    }

}