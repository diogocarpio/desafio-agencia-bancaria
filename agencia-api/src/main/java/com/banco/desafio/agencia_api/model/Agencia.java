package com.banco.desafio.agencia_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "agencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double posX;
    private double posY;
}
