## DesafioControleFluxo


## Descrição

Este projeto, chamado DesafioControleFluxo, tem como objetivo exercitar o controle de fluxo em Java através de um cenário fictício de produção de brinquedos. O programa recebe dois parâmetros via terminal que representam números inteiros. Com esses dois números, ele calcula a quantidade de brinquedos produzidos e imprime no console a quantidade de brinquedos produzidos. Se o primeiro parâmetro for maior que o segundo, o programa lança uma exceção personalizada.

## Estrutura do Projeto
O projeto é composto por duas classes principais:

Contador.java: Esta classe contém toda a lógica do programa.
ParametrosInvalidosException.java: Esta classe representa uma exceção personalizada para o caso em que o primeiro parâmetro é maior que o segundo.
Funcionamento
O programa funciona da seguinte maneira:

Solicita ao usuário a entrada de dois parâmetros inteiros positivos.
Valida os parâmetros e, se forem válidos, calcula a quantidade de brinquedos produzidos.
Se o primeiro parâmetro for maior que o segundo, lança uma exceção personalizada.
Exibe a quantidade de brinquedos produzidos no console.
Pergunta ao usuário se deseja continuar inserindo outros conjuntos de parâmetros ou encerrar o programa.
Ao encerrar, o programa exibe uma mensagem de agradecimento.