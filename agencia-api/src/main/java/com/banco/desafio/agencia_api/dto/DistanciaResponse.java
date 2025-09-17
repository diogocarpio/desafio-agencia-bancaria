package com.banco.desafio.agencia_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DistanciaResponse {
    private String agencia;
    private double distancia;
}