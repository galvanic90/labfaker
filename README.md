[![CI/CD Pipeline](https://github.com/galvanic90/labfaker/actions/workflows/build.yml/badge.svg)](https://github.com/galvanic90/labfaker/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=bugs)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=coverage)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=galvanic90_labfaker&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)
[![SonarQube Cloud](https://sonarcloud.io/images/project_badges/sonarcloud-light.svg)](https://sonarcloud.io/summary/new_code?id=galvanic90_labfaker)

# labfaker

Este repositorio contiene el código correspondiente al segundo laboratorio de la asignatura Arquitectura de 
computadores.

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```