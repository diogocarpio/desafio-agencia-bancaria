package com.banco.desafio.agencia_api.service;

import com.banco.desafio.agencia_api.dto.AgenciaRequest;
import com.banco.desafio.agencia_api.model.Agencia;
import com.banco.desafio.agencia_api.repository.AgenciaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AgenciaServiceTest {

    private final AgenciaRepository repository = Mockito.mock(AgenciaRepository.class);
    private final AgenciaService service = new AgenciaService(repository);

    @Test
    void deveCadastrarAgencia() {
        AgenciaRequest request = new AgenciaRequest();
        request.setPosX(10);
        request.setPosY(20);

        Agencia agencia = Agencia.builder().id(1L).posX(10).posY(20).build();
        Mockito.when(repository.save(Mockito.any())).thenReturn(agencia);

        Agencia result = service.cadastrar(request);

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getPosX()).isEqualTo(10);
        assertThat(result.getPosY()).isEqualTo(20);
    }

    @Test
    void deveCalcularDistancia() {
        Agencia agencia1 = Agencia.builder().id(1L).posX(0).posY(0).build();
        Agencia agencia2 = Agencia.builder().id(2L).posX(3).posY(4).build();

        Mockito.when(repository.findAll()).thenReturn(List.of(agencia1, agencia2));

        var distancias = service.calcularDistancias(0, 0);

        assertThat(distancias).hasSize(2);
        assertThat(distancias.get(0).getDistancia()).isEqualTo(0.0);
        assertThat(distancias.get(1).getDistancia()).isEqualTo(5.0);
    }
}
