# Bootcamp Decola Tech 6º 
Java RESTful API criada para o Bootcamp Decola Tech 2025

## Principais Tecnologias
- *Java 17* : Utilizaremos a versão LTS mais recente do Java para tirar vantagem das inovações que essa linguagem robusta e amplamente utilizada oferece;
- *Spring Boot 3* : Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de suas poderosas metas de autoconfiguração;
- *Spring Data JPA* : Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- *OpenAPI (Swagger)* : Vamos criar uma documentação de API eficaz e fácil de entender usando OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
Ferrovia : facilita a implantação e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        +Long id
        +String nome
        +String email
        +String senha
        +List<ListaCompras> listas
    }
    
    class ListaCompras {
        +Long id
        +String nome
        +Usuario usuario
        +List<ItemCompra> itens
    }

    class ItemCompra {
        +Long id
        +String nome
        +Integer quantidade
        +Boolean comprado
        +ListaCompras lista
    }

    Usuario "1" --> "N" ListaCompras 
    ListaCompras "1" --> "N" ItemCompra 

```

