Code Challenge de Agência Bancaria

# API de Agências - Desafio Técnico

Este projeto foi desenvolvido como parte de um **teste técnico** para uma empresa Bancaria.  
A aplicação consiste em uma **API REST** em **Java 21 + Spring Boot 3** para:

- Cadastrar **Agências** com coordenadas `X` e `Y`
- Calcular a **distância entre o usuário e as agências cadastradas**
- Retornar os resultados **ordenados da agência mais próxima para a mais distante**
- Disponibilizar documentação da API com **Swagger/OpenAPI**

---

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Maven**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (em memória)**
- **Lombok**
- **Spring DevTools**
- **Springdoc OpenAPI (Swagger)**
- **JUnit 5 + Mockito** (para testes)

---

## Estrutura do Projeto

```bash
desafio-agencia-bancaria/
├── src/
│   ├── main/
│   │   ├── java/com/santander/desafio/agenciaapi/
│   │   │   ├── controller/        # Controllers (endpoints REST)
│   │   │   ├── dto/               # Objetos de transferência de dados (requests/responses)
│   │   │   ├── model/             # Entidades JPA
│   │   │   ├── repository/        # Interfaces de persistência
│   │   │   ├── service/           # Regras de negócio
│   │   │   ├── util/              # Classes utilitárias (ex: cálculo de distância)
│   │   │   └── config/            # Configurações (Swagger, etc.)
│   │   └── resources/
│   │       ├── application.yml    # Configurações do projeto
│   │       └── data.sql           # (opcional) Dados iniciais
│   └── test/
│       └── java/com/santander/desafio/agenciaapi/
│           └── service/           # Testes unitários de serviços
│
├── pom.xml                        # Gerenciador de dependências Maven
└── README.md                      # Documentação do projeto
└── RUN.md                         # Documentação de como rodar o projeto
