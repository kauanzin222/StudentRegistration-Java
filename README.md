# Cadastro de Alunos
## Projeto Full-Stack com Java e Spring Boot 🖥️

<p align="right">
  <a href="README.md">Português</a> | <a href="README.en.md">English</a>
</p>

Um projeto didático desenvolvido para demonstrar os conceitos fundamentais de uma aplicação Full-Stack, conectando um backend construído com **Java** e **Spring Boot** a um frontend simples utilizando **HTML, CSS, e JavaScript com jQuery**.

O sistema consiste em um formulário para cadastro de estudantes, que são listados em uma tabela na mesma página. É o projeto ideal para quem está começando a entender como o frontend e o backend "conversam" através de uma API REST.

![Screenshot da Aplicação](/student-frontend/images/desktopResult.png)

---

## 🎯 Principais Aprendizados do Projeto

Este repositório não é apenas um código funcional, mas uma ferramenta de estudo. Ao explorá-lo, você entenderá na prática:

### Conceitos de Backend (Java & Spring Boot)

1.  **Criação de um Servidor Web:** Como o Spring Boot, com pouquíssima configuração, sobe um servidor web (Tomcat embutido) pronto para receber requisições.
2.  **Arquitetura REST:** O que é uma API REST e como ela funciona como uma "ponte" entre o cliente (navegador) e o servidor.
3.  **Controllers e Mapeamento de Endpoints:**
   *   Uso do `@RestController` para definir uma classe que responderá a requisições web.
   *   Uso do `@GetMapping` para criar endpoints que **entregam** dados (ex: listar todos os cursos e alunos).
   *   Uso do `@PostMapping` para criar endpoints que **recebem** dados para criar um novo recurso (ex: cadastrar um novo aluno).
4.  **Manipulação de Dados com JSON:**
   *   Como o Spring Boot (com a biblioteca Jackson) converte automaticamente objetos Java em texto JSON para enviar ao frontend.
   *   Como a anotação `@RequestBody` faz o processo inverso, convertendo o texto JSON enviado pelo frontend em um objeto Java pronto para ser usado.
5.  **CORS (`@CrossOrigin`):** Por que ocorre o erro de "Cross-Origin Resource Sharing" e como essa simples anotação resolve o problema, permitindo que nosso frontend (rodando em `file://` ou outro domínio) acesse a API do backend (rodando em `localhost:8080`).
6.  **Estrutura de um Projeto Spring Boot:** A organização básica de pacotes (`models`, `resources`) e o papel do arquivo `pom.xml` para gerenciar as dependências do projeto com o Maven.

### Conceitos de Frontend (HTML, JS, jQuery)

1.  **Consumo de API com AJAX:** Como usar o `$.ajax` e `$.getJSON` do jQuery para fazer requisições HTTP para o backend.
2.  **Requisições Assíncronas:** Entender que o JavaScript não "trava" enquanto espera a resposta do servidor. O código dentro do `success` só é executado quando a resposta chega.
3.  **Manipulação Dinâmica do DOM:**
   *   Como popular um `<select>` (o de cursos) com dados vindos da API.
   *   Como adicionar novas linhas (`<tr>`) e células (`<td>`) a uma tabela dinamicamente cada vez que um novo aluno é cadastrado ou a página é carregada.
4.  **Serialização de Dados (`JSON.stringify`):** A importância de converter um objeto JavaScript em uma string no formato JSON antes de enviá-lo no corpo (`data`) de uma requisição `POST`.
5.  **Interação com o Usuário:** Capturar dados de um formulário, usar plugins (jQuery Mask) para melhorar a experiência do usuário e limpar o formulário após o envio bem-sucedido.

---

## 🚀 Tecnologias Utilizadas

### Backend
*   **Java 21**
*   **Spring Boot 3**
*   **Spring Web:** Para criar os endpoints da API REST.
*   **Spring Boot DevTools:** Para live reload automático do backend.
*   **Maven:** Para gerenciamento de dependências.

### Frontend
*   **HTML5**
*   **CSS3**
*   **Bootstrap 5:** Para estilização rápida e responsividade.
*   **JavaScript (ES6)**
*   **jQuery:** Para simplificar a manipulação do DOM e as chamadas AJAX.
*   **jQuery Mask Plugin:** Para aplicar máscaras nos campos do formulário (ex: telefone).

---

## 📂 Estrutura do Projeto

```
StudentRegistration-Java/
├── student-backend/      # Pasta do projeto Spring Boot
│   ├── src/main/java/
│   │   └── com/abutua/student_backend/
│   │       ├── models/         # Classes que representam os dados (ex: Student, Course)
│   │       └── resources/      # Controllers da API REST (ex: StudentController)
│   └── pom.xml             # Arquivo de configuração do Maven
│
└── student-frontend/     # Pasta do projeto Frontend
    ├── css/
    │   └── style.css
    ├── js/
    │   ├── script.js         # Lógica principal do frontend
    │   ├── jquery-3.6.0.min.js
    │   └── jquery.mask.min.js
    └── index.html          # Estrutura da página web
```

****