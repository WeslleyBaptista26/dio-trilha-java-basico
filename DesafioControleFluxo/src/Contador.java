import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int inicioDia = 0;
            int finalDia = 0;
            boolean parametrosValidos = false;

            while (!parametrosValidos) {
                try {
                    System.out.println("Digite o número de brinquedos produzidos no início do dia:");
                    inicioDia = lerParametro(terminal);
                    System.out.println("Digite o número de brinquedos produzidos no final do dia:");
                    finalDia = lerParametro(terminal);

                    parametrosValidos = true;

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida! Por favor, insira um número inteiro positivo.");
                    terminal.nextLine(); // Limpar o buffer do scanner
                }
            }

            // Verifica se ambos os parâmetros são positivos para imprimir a contagem
            if (inicioDia > 0 && finalDia > 0) {
                System.out.println("Iniciando produção:");
                for (int i = 1; i <= inicioDia; i++) {
                    System.out.println("Produzindo brinquedo número " + i);
                }
            }

            try {
                // Chamando o método contendo a lógica de contagem
                calcularProducao(inicioDia, finalDia);
            } catch (ParametrosInvalidosException exception) {
                // Imprimir a mensagem: O número de brinquedos no final do dia deve ser maior que no início do dia
                System.out.println("Erro: O número de brinquedos no final do dia deve ser maior que no início do dia.");
            }

            System.out.println("Deseja inserir outro conjunto de parâmetros? (s/n)");
            String resposta = terminal.next().toLowerCase();
            while (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Resposta inválida. Por favor, responda com 's' para continuar ou 'n' para encerrar.");
                resposta = terminal.next().toLowerCase();
            }

            continuar = resposta.equals("s");
        }

        terminal.close();
        System.out.println("Programa finalizado. Obrigado por utilizar!");
    }

    static int lerParametro(Scanner terminal) {
        while (true) {
            try {
                int parametro = terminal.nextInt();
                if (parametro < 0) {
                    System.out.println("Erro: Por favor, insira um número inteiro positivo.");
                } else {
                    return parametro;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Por favor, insira um número inteiro positivo.");
                terminal.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

    static void calcularProducao(int inicioDia, int finalDia) throws ParametrosInvalidosException {
        // Validar se inicioDia é MAIOR que finalDia e lançar a exceção
        if (inicioDia > finalDia) {
            throw new ParametrosInvalidosException();
        }
        
        // Realizar a lógica de contagem
        int producao = finalDia - inicioDia;
        if (producao == 0) {
            System.out.println("Nenhum brinquedo foi produzido.");
        } 
    }
}