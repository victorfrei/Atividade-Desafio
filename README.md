
# Etapas para fazer o projeto funcionar

### - [ ] Configurações


1. - [ ] Configurar um servidor local
> - [ ] Xampp
> - [ ] Tomcat

2. - [ ] Configurar o Banco de Dados
> - [ ] Criar uma base de dados e uma tabela

3. - [x] Dependências e bibliotecas do java
> - [x] PrimeFaces 5.0
> - [x] Driver Mysql (mysql-connector-java-5.1.23)
> - [x] JSF 2.2


# Como configurar o ambiente para uso

## 1. - [ ] Configurar um servidor local

### Windows

1. Baixe o [Xampp](https://www.apachefriends.org/pt_br/index.html)
2. Instale o Xampp com as opções de _Mysql_ e _Tomcat_ selecionadas

> - [x] Xampp

![tomcat-config](https://user-images.githubusercontent.com/42474899/121092455-f2bcb100-c7c1-11eb-9f0f-765a00899c5c.png)

3. Na pagina do Xampp selecione **Config** do _tomcat_
4. selecione _tomcat-user.xml_
5. Substitua todo o texto pelo código abaixo:


```
<?xml version="1.0" encoding="UTF-8"?>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<tomcat-users xmlns="http://tomcat.apache.org/xml"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd"
              version="1.0">
<!--
  NOTE:  By default, no user is included in the "manager-gui" role required
  to operate the "/manager/html" web application.  If you wish to use this app,
  you must define such a user - the username and password are arbitrary. It is
  strongly recommended that you do NOT use one of the users in the commented out
  section below since they are intended for use with the examples web
  application.
-->
<!--
  NOTE:  The sample user and role entries below are intended for use with the
  examples web application. They are wrapped in a comment and thus are ignored
  when reading this file. If you wish to configure these users for use with the
  examples web application, do not forget to remove the <!.. ..> that surrounds
  them. You will also need to set the passwords to something appropriate.
-->

  <role rolename="tomcat"/>
  <role rolename="manager-script"/>
  <user username="tomcat" password="123456" roles="tomcat,manager-script"/>

<!--
  <role rolename="tomcat"/>
  <role rolename="role1"/>
  <user username="tomcat" password="<must-be-changed>" roles="tomcat,manager-script"/>
  <user username="admin" password="12151714" roles="tomcat,role1"/>
  <user username="role1" password="<must-be-changed>" roles="role1"/>
-->
</tomcat-users>


```

> - [x] Tomcat

6. Configuração do servidor finalizada
> - [x] Configurar um servidor local


## 2. - [ ] Configurar o Banco de Dados


![sql-create](https://user-images.githubusercontent.com/42474899/121092453-f2241a80-c7c1-11eb-9084-4c361160fe94.png)

1. Inicialize o mysql e o apache pelo Xampp
2. Acesse o seguinte link: [mysql](http://localhost/phpmyadmin/index.php?route=/server/sql)
3. Para criar a base de dados e a tabela necessaria insira o código abaixo no mysql e execute

```
CREATE DATABASE usuario;
use usuario;

CREATE TABLE usuario (
     id INT PRIMARY KEY,
     nome VARCHAR(30),
     senha VARCHAR(10),
     descricao VARCHAR(50),
     data_cadastro TIMESTAMP
);

```

> - [x] Criar uma base de dados e uma tabela

4. Configuração do Banco de Dados concluida

> - [x] Configurar o Banco de Dados


## Todas as configurações foram feitas

- [x] Configurações

# Inicializando o projeto


![selecionar-chrome](https://user-images.githubusercontent.com/42474899/121092451-f18b8400-c7c1-11eb-8e42-3c73594562a1.png)


1. Selecione o google chrome como navegador (maior compatibilidade)

![selecionar-play](https://user-images.githubusercontent.com/42474899/121092452-f2241a80-c7c1-11eb-816b-3bfa5fe1624e.png)

2. Na IDE (netbeans) selecione executar o arquivo

3. Bons Estudos.