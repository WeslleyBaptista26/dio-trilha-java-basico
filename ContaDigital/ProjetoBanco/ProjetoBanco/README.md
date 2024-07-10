
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

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado.
- Visual Studio Code (ou outra IDE de sua preferência).

### Passos para Compilação e Execução

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/ProjetoBanco.git
