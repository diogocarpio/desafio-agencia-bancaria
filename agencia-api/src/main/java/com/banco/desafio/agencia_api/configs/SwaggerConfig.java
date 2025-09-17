package com.banco.desafio.agencia_api.configs;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Agências")
                        .description("Desafio Técnico - Cadastro e Distância entre Agências")
                        .version("1.0.0"));
    }
}