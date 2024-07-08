public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o número de brinquedos no final do dia deve ser maior que no início do dia.");
    }
}