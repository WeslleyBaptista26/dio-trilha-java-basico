# Projeto Bootcamp

Este projeto foi desenvolvido como parte de um bootcamp de desenvolvimento Java. O objetivo é criar uma aplicação para gerenciar bootcamps, cursos e mentorias, permitindo que desenvolvedores se inscrevam, progridam e acumulem experiência (XP).

## Estrutura do Projeto

O projeto está estruturado em várias classes principais:

- `Bootcamp`: Representa um bootcamp com cursos e mentorias.
- `Conteudo`: Classe abstrata que serve de base para `Curso` e `Mentoria`.
- `Curso`: Representa um curso com título, descrição e carga horária.
- `Mentoria`: Representa uma mentoria com título, descrição e data.
- `Dev`: Representa um desenvolvedor inscrito no bootcamp, com métodos para inscrição, progresso e cálculo de XP.

## Classes e Funcionalidades

### Bootcamp

- `Bootcamp`: Classe que contém informações sobre o bootcamp, como nome, descrição, data de início e fim, desenvolvedores inscritos e conteúdos oferecidos.

### Conteudo

- `Conteudo`: Classe abstrata que define os métodos básicos para calcular XP e obter título e descrição dos conteúdos.

### Curso

- `Curso`: Extende `Conteudo` e inclui informações adicionais sobre carga horária.

### Mentoria

- `Mentoria`: Extende `Conteudo` e inclui informações adicionais sobre a data da mentoria.

### Dev

- `Dev`: Classe que representa um desenvolvedor inscrito em um bootcamp. Contém métodos para inscrição, progresso e cálculo de XP acumulado.