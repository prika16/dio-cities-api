## API de cidades do Brasil

## Este projeto é uma API Rest de consulta de cidades do Brasil com dados comparativos. Foi desenvolvido durante o curso Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção, ministrado pelo professor André Gomes.

## Tecnologias utilizadas

    *Linux
    *Git
    *Java 8
    *Docker
    *PostgreSQL
    *IntelliJ Community
    **Heroku CLI
    Swagger

## Spring Boot

    https://start.spring.io/

    Java 8
    Gradle Project
    Jar
    Spring Web
    Spring Data JPA
    PostgreSQL Driver

## DataBase
# Postgres

    Postgres Docker Hub
    Comando para baixar e criar o container do Postgres para o projeto:

docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

Configuração e importação das querys dentro do container Postgres:

    data

git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git

cd sql-paises-estados-cidades/PostgreSQL

docker start cities-db

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;

## Swagger

    Acesse a Documentação da API hospedada no Heroku:
        https://floating-brushlands-95276.herokuapp.com/swagger-ui.html#/
        https://floating-brushlands-95276.herokuapp.com/v2/api-docs

## Consumindo API no Postman

 Para consumir a API no Postman, pode, por exemplo, fazer os seguintes GET:
        Países: https://young-shelf-12065.herokuapp.com/countries
        Estados do Brasil: https://young-shelf-12065.herokuapp.com/staties
        Cidades do Brasil: https://young-shelf-12065.herokuapp.com/cities
        Distância em milhas: https://young-shelf-12065.herokuapp.com/distances/by-points?from=4929&to=5254
