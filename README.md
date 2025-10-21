📝 ToDoList Back-End

Este é o back-end de uma aplicação ToDo List desenvolvida em Java com Spring Boot, utilizando JPA, H2 Database, DTOs e ModelMapper. O sistema permite gerenciar tarefas categorizadas por tipo, com funcionalidades de CRUD completas via API REST.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

H2 Database (em memória)

ModelMapper

Lombok

Jakarta Validation

CORS Config

📁 Estrutura do Projeto
src/
├── configuration/       # Configurações de CORS e ModelMapper
├── controller/          # Camada Controller (API REST)
├── dto/                 # DTOs de entrada e saída
├── model/               # Entidades JPA e enums
├── repository/          # Interface de repositório (JPA)
├── service/             # Lógica de negócio e regras

📦 Funcionalidades
✅ Tarefas (Forms)

Listar todas as tarefas: GET /api/forms

Criar nova tarefa: POST /api/forms

Atualizar tarefa existente: PUT /api/forms/{id}

Deletar tarefa: DELETE /api/forms/{id}

📌 Categoria

Tarefas podem ser classificadas com uma das seguintes categorias:

ESTUDOS

TRABALHO

LAZER

📄 Exemplo de JSON para Criar/Atualizar
{
  "titulo": "Estudar Spring Boot",
  "categoria": "ESTUDOS",
  "tempo": 120,
  "completed": false
}

🛠️ Configuração do Projeto
📍 Banco de Dados

O projeto utiliza o H2 Database em memória, acessível em:

Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:forms

Usuário: sa

Senha: (vazio)

🌐 CORS

A API está configurada para aceitar requisições do front-end rodando em:

http://localhost:5173


Altere esse valor em CorsConfig.java caso necessário.

▶️ Como Rodar o Projeto
Pré-requisitos

Java 17+

Maven

Passos

Clone o repositório:

git clone https://github.com/seu-usuario/toDoList-backEnd.git


Acesse a pasta do projeto:

cd toDoList-backEnd


Compile e rode:

./mvnw spring-boot:run


Acesse a API em: http://localhost:8080/api/forms

📫 Contato

Desenvolvido por Felipe Movio

Sinta-se à vontade para contribuir, abrir issues ou sugerir melhorias!
