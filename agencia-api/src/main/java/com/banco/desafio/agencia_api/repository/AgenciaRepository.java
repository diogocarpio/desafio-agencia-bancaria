package com.banco.desafio.agencia_api.repository;

import com.banco.desafio.agencia_api.model.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciaRepository extends JpaRepository<Agencia, Long> {
}