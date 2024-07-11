
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




