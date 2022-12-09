# Módulo 3 - Semana 2
Criar um projeto para um **PetShop** utilizando Spring Boot, adicionando dependência Spring Web.

## 1) CRUD
No projeto deverá existir endpoints com a função de CRUD (**C**reate, **R**ead, **U**pdate e **D**elete) para Tutores e seus Pets.
- Inicialmente, todos os endpoints deverão retornar uma String indicando sua finalidade.

> Implementados em *\controller*.

## 2) MVC
Construa os Models para representar Tutores e Pets.
Com isso, vamos implemente uma classe de serviço e outra que represente a classe de persistência para salvarmos os dados necessários.

Construa a lógica necessária do CRUD de Tutor e Pet.

> Implementados em *\model*.

## 3) Autorização
Criar um perfil de acesso ("ADMIN") para o usuário existente.
Utilizar o JWT em suas requisições para verificar o usuário logado e seu acesso.

> Implementado em *\security\SecurityConfig*.

## 4) Autenticação
Criar um usuário padrão para autenticação.
Realizar as configurações necessárias para retornar o JWT (JSON Web Tokens).
Criar um endpoint para que o usuário se autentique e receba o JWT.

Dessa maneira, teremos um usuário que pode realizar o login no sistema.

> Implementado na pasta *\service\LoginService* e *\security\SecurityConfig*.