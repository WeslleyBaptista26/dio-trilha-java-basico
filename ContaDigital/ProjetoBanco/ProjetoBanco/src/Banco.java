// Classe abstrata Conta
abstract class Conta {
    // Encapsulamento: atributos privados
    private String numero;
    private double saldo;

    // Construtor
    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Métodos públicos para acessar e modificar os atributos
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos públicos para manipular o saldo da conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente!");
        }
    }

    // Método abstrato para aplicar rendimentos, a ser implementado nas subclasses
    public abstract void aplicarRendimentos();
}

// Classe ContaCorrente que herda de Conta (Herança)
class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 12.0;

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void aplicarRendimentos() {
        // Contas correntes não possuem rendimentos
    }

    public void cobrarTaxaManutencao() {
        sacar(TAXA_MANUTENCAO);
    }
}

// Classe ContaPoupanca que herda de Conta (Herança)
class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.05;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void aplicarRendimentos() {
        double rendimento = getSaldo() * TAXA_RENDIMENTO;
        depositar(rendimento);
    }
}

// Classe principal para testar o código
public class Banco {
    public static void main(String[] args) {
        // Polimorfismo: objetos são referenciados pela classe abstrata Conta
        Conta cc = new ContaCorrente("12345-6");
        Conta cp = new ContaPoupanca("78910-1");

        cc.depositar(1000);
        cp.depositar(500);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

        cc.transferir(200, cp);
        System.out.println("Após transferência:");
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

        cp.aplicarRendimentos();
        System.out.println("Após aplicar rendimentos na Poupança:");
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
