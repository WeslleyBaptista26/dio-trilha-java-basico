public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    private Usuario usuario;

    public Conta(int numero, String agencia, String nomeCliente, double saldo, Usuario usuario) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
