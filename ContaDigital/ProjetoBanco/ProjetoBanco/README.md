
# Sistema Bancário Orientado a Objetos

## Descrição

Este projeto implementa um sistema bancário simples utilizando a linguagem de programação Java, aplicando conceitos de Orientação a Objetos como abstração, encapsulamento, herança e polimorfismo. O sistema gerencia dois tipos de contas bancárias: Conta Corrente e Conta Poupança, com funcionalidades de depósito, saque e transferência entre contas da mesma instituição.

## Funcionalidades

1. **Conta (Classe Abstrata)**
   - Atributos:
     - `numero` (String): Número da conta.
     - `saldo` (double): Saldo disponível na conta.
   - Métodos:
     - `getNumero()`: Retorna o número da conta.
     - `getSaldo()`: Retorna o saldo da conta.
     - `depositar(double valor)`: Adiciona um valor ao saldo da conta.
     - `sacar(double valor)`: Subtrai um valor do saldo da conta, se houver saldo suficiente.
     - `transferir(double valor, Conta destino)`: Transfere um valor para outra conta, se houver saldo suficiente.
     - `aplicarRendimentos()`: Método abstrato para aplicar rendimentos, a ser implementado nas subclasses.

2. **Conta Corrente (Subclasse de Conta)**
   - Métodos:
     - `aplicarRendimentos()`: Não aplica rendimentos para Conta Corrente.
     - `cobrarTaxaManutencao()`: Cobra uma taxa de manutenção mensal da conta.

3. **Conta Poupança (Subclasse de Conta)**
   - Métodos:
     - `aplicarRendimentos()`: Aplica rendimentos mensais sobre o saldo da conta.

## Implementação dos Conceitos de POO

1. **Encapsulamento**
   - Atributos `numero` e `saldo` da classe `Conta` são privados.
   - Métodos públicos (`getNumero()`, `getSaldo()`, `depositar()`, `sacar()`) controlam o acesso e a modificação dos atributos.

2. **Herança**
   - Classes `ContaCorrente` e `ContaPoupanca` herdam da classe abstrata `Conta`.
   - Subclasses implementam o método abstrato `aplicarRendimentos()` de maneiras diferentes.

3. **Polimorfismo**
   - Objetos de `ContaCorrente` e `ContaPoupanca` são referenciados pela classe abstrata `Conta`.
   - O método `aplicarRendimentos()` é chamado em objetos de tipos diferentes, com comportamentos específicos de cada tipo.


