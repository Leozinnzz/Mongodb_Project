# 🗃️ Projeto CRUD com Java e MongoDB

Este é um projeto de CRUD (Create, Read, Update, Delete) desenvolvido em **Java** utilizando o banco de dados **MongoDB**. Ele tem como objetivo demonstrar a integração entre aplicações Java e bancos NoSQL, aplicando os principais conceitos de persistência de dados com MongoDB.

## 🚀 Tecnologias Utilizadas

- **Java 17**  
- **MongoDB**  
- **MongoDB Java Driver**  
- **Maven** (ou Gradle, dependendo do que usou)  
- **IDE**: IntelliJ IDEA / Eclipse / STS

## 🧩 Funcionalidades

- Criar documentos no banco de dados  
- Listar todos os registros  
- Buscar registros por campos específicos (ex: ID, nome, etc.)  
- Atualizar dados existentes  
- Remover registros do banco  

## 🏗️ Estrutura do Projeto

A estrutura do projeto está organizada em camadas para melhor separação de responsabilidades:

- `model` – Representa as entidades persistidas no MongoDB  
- `repository` – Contém a lógica de comunicação com o banco  
- `service` – Regras de negócio  
- `main` – Ponto de entrada da aplicação (interface de teste ou execução)  

## 📦 Como Executar

1. Certifique-se de ter o **MongoDB** instalado e rodando localmente (ou altere para sua string de conexão remota).  
2. Clone este repositório:  
   ```bash
   git clone https://github.com/SeuUsuario/nome-do-repo.git
