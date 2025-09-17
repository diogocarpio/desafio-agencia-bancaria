package com.banco.desafio.agencia_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AgenciaRequest {
    @NotNull(message = "A posição X é obrigatória")
    double posX;

    @NotNull(message = "A posição Y é obrigatória")
    double posY;
}