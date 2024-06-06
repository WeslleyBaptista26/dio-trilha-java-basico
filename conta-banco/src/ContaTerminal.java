import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("Olá, bem-vindo à nossa agência!!");
            System.out.println("Escolha o serviço que deseja:");
            System.out.println("1 - Acessar conta");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Encerrar");

            int escolha = obterEscolha(scanner);

            if (escolha == 1) {
                banco.acessarConta(scanner);
            } else if (escolha == 2) {
                banco.criarConta(scanner);
            } else if (escolha == 3) {
                System.out.println("Atendimento finalizado. Agradecemos sua visita e esperamos vê-lo novamente. Tenha um ótimo dia!");
                break;
            }
        }

        scanner.close();
    }

    private static int obterEscolha(Scanner scanner) {
        int escolha = 0;
        while (true) {
            try {
                escolha = Integer.parseInt(scanner.nextLine());
                if (escolha >= 1 && escolha <= 3) {
                    break;
                } else {
                    System.out.println("Opção inválida, por favor escolha entre 1 e 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor insira um número.");
            }
        }
        return escolha;
    }
}
