# Guia de Execução - API de Agências

Este documento explica como rodar o projeto **desafio-agencia-bancaria** localmente e como acessar seus endpoints.

---

## Pré-requisitos
- [Java 21]
- [Maven 3.9+]
- IDE (VS Code, IntelliJ, Eclipse)

---

## Documentação
A documentação da API está disponível via Swagger/OpenAPI:
http://localhost:8080/swagger-ui.html

---

## Banco de Dados
O projeto utiliza o H2 Database (em memória).
Console disponível em: http://localhost:8080/h2-console
Configurações de acesso:
JDBC URL: jdbc:h2:mem:agenciasdb
User: sa
Password: (vazio)

---
### Clonar o repositório

```bash
git clone https://github.com/diogocarpio/desafio-agencia-bancaria.git