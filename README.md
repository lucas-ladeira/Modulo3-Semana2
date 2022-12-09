# M�dulo 3 - Semana 2
Criar um projeto para um **PetShop** utilizando Spring Boot, adicionando depend�ncia Spring Web.

## 1) CRUD
No projeto dever� existir endpoints com a fun��o de CRUD (**C**reate, **R**ead, **U**pdate e **D**elete) para Tutores e seus Pets.
- Inicialmente, todos os endpoints dever�o retornar uma String indicando sua finalidade.

> Implementados em *\controller*.

## 2) MVC
Construa os Models para representar Tutores e Pets.
Com isso, vamos implemente uma classe de servi�o e outra que represente a classe de persist�ncia para salvarmos os dados necess�rios.

Construa a l�gica necess�ria do CRUD de Tutor e Pet.

> Implementados em *\model*.

## 3) Autoriza��o
Criar um perfil de acesso ("ADMIN") para o usu�rio existente.
Utilizar o JWT em suas requisi��es para verificar o usu�rio logado e seu acesso.

> Implementado em *\security\SecurityConfig*.

## 4) Autentica��o
Criar um usu�rio padr�o para autentica��o.
Realizar as configura��es necess�rias para retornar o JWT (JSON Web Tokens).
Criar um endpoint para que o usu�rio se autentique e receba o JWT.

Dessa maneira, teremos um usu�rio que pode realizar o login no sistema.

> Implementado na pasta *\service\LoginService* e *\security\SecurityConfig*.