# Desafio de Projetos da Dio - Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway
Reposítório para o Desafio de Projetos da Dio - Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Projeto de Referência:
https://github.com/falvojr/santander-dev-week-2023

## Diagrama de Classes:
```mermaid

classDiagram
  class Usuario {
    -nome: String
    -conta: Conta
    -funcionalidades: Funcionalidade[]
    -cartao: Cartao
    -noticias: Noticia[]
  }

  class Conta {
    -numero: String
    -agencia: String
    -saldo: Float
    -limite: Float
  }

  class Funcionalidade {
    -icone: String
    -descricao: String
  }

  class Cartao {
    -numero: String
    -limite: Float
  }

  class Noticia {
    -icone: String
    -descricao: String
  }

  Usuario "1" *-- "1" Conta
  Usuario "1" *-- "N" Funcionalidade
  Usuario "1" *-- "1" Cartao
  Usuario "1" *-- "N" Noticia
```
