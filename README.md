📦 Sistema de Gerenciamento de Produtos em Java

Sistema simples para cadastro e gerenciamento de produtos, desenvolvido em Java, com foco em aprendizado de Programação Orientada a Objetos (POO), organização de projetos e boas práticas de desenvolvimento.

📋 Funcionalidades

➕ Cadastrar novos produtos

📄 Listar todos os produtos cadastrados

🔎 Buscar produto por ID

✏️ Atualizar informações de um produto

🛠️ Tecnologias utilizadas

☕ Java

Programação Orientada a Objetos (POO)

Streams API

Estrutura de pacotes

IDE: IntelliJ IDEA

📂 Estrutura do projeto
src/
 └── com/empresa/app
      ├── Main.java
      │
      ├── model
      │     └── Produto.java
      │
      ├── repository
      │     └── ProdutoRepository.java
      │
      └── view
            └── ProdutoView.java
Descrição das camadas

model → Representa as entidades do sistema (Produto).

repository → Responsável por armazenar e gerenciar os dados.

view → Responsável pela interação com o usuário.

Main → Classe principal que executa o sistema.

📦 Classe Produto

A classe Produto representa um produto dentro do sistema.

Atributos principais:

id

nome

preco

categoria

Exemplo:

Produto produto = new Produto(1L, "Notebook", 3500.00, "Eletrônicos");
▶️ Como executar o projeto

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o projeto no IntelliJ IDEA

Execute a classe:

Main.java
🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de:

Praticar Java

Aplicar conceitos de POO

Aprender organização de projetos

Criar projetos para portfólio no GitHub

📚 Conceitos aplicados

Classes e objetos

Encapsulamento

Métodos get e set

Listas (List)

Streams

Organização em pacotes

👨‍💻 Autor

Daniel Pereira

📎 GitHub:
https://github.com/Daniel-Pereira-TI-dpr
