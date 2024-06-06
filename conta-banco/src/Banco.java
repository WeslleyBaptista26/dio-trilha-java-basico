import java.util.Scanner;

public class Banco {
    private Conta contaAtual;

    public void acessarConta(Scanner scanner) {
        System.out.println("Digite o número da Agência:");
        String agencia = obterEntradaValida(scanner, true);

        System.out.println("Digite a senha (apenas números):");
        String senha = obterEntradaValida(scanner, true);

        if (contaAtual == null) {
            System.out.println("Nenhuma conta cadastrada com esses dados. Criando uma conta de teste...");
            Usuario usuarioTeste = new Usuario("000.000.000-00", "01/01/2000", senha);
            contaAtual = new Conta(1021, agencia, "Cliente Teste", 0.0, usuarioTeste);
        }

        while (true) {
            if (agencia.equals(contaAtual.getAgencia()) && senha.equals(contaAtual.getUsuario().getSenha())) {
                while (true) {
                    System.out.println("Acesso permitido. Escolha uma opção:");
                    System.out.println("1 - Consultar saldo");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Depositar");
                    System.out.println("4 - Finalizar");

                    int opcao = obterOpcaoValida(scanner, 1, 4);

                    switch (opcao) {
                        case 1:
                            System.out.println("Seu saldo é: " + contaAtual.getSaldo());
                            break;
                        case 2:
                            realizarSaque(scanner, contaAtual);
                            break;
                        case 3:
                            realizarDeposito(scanner, contaAtual);
                            break;
                        case 4:
                            System.out.println("Operação finalizada. Obrigado por acessar o aplicativo da nossa agência!");
                            return; // Encerra o método acessarConta
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("Agência ou senha incorreta.");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Encerrar");
                int opcao = obterOpcaoValida(scanner, 1, 2);
                if (opcao == 2) {
                    System.out.println("Operação finalizada. Obrigado por acessar o aplicativo da nossa agência!");
                    return; // Encerra o método acessarConta
                } else {
                    System.out.println("Digite o número da Agência:");
                    agencia = obterEntradaValida(scanner, true);

                    System.out.println("Digite a senha (apenas números):");
                    senha = obterEntradaValida(scanner, true);
                }
            }
        }
    }

    public void criarConta(Scanner scanner) {
        String cpf = obterEntradaValida(scanner, "Por favor, digite seu CPF:", true);
        String dataNascimento = obterEntradaValida(scanner, "Por favor, digite sua data de nascimento (DD/MM/AAAA):", true);
        String senha = obterEntradaValida(scanner, "Por favor, crie uma senha (apenas números):", true);
        String agencia = obterEntradaValida(scanner, "Digite o número da agência:", true);
        String nomeCliente = obterEntradaValida(scanner, "Digite seu nome:", false);

        Usuario novoUsuario = new Usuario(cpf, dataNascimento, senha);
        contaAtual = new Conta(1021, agencia, nomeCliente, 0.0, novoUsuario);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Obrigado por criar uma conta em nosso banco, " + nomeCliente + ".");
        System.out.println("Agora você pode acessar sua conta utilizando o número da agência e a senha cadastrada.");

        acessarConta(scanner);
    }

    private int obterOpcaoValida(Scanner scanner, int min, int max) {
        int opcao = 0;
        while (true) {
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= min && opcao <= max) {
                    break;
                } else {
                    System.out.println("Opção inválida, por favor escolha entre " + min + " e " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor insira um número.");
            }
        }
        return opcao;
    }

    private void realizarSaque(Scanner scanner, Conta conta) {
        System.out.println("Digite o valor para saque:");
        try {
            double valorSaque = Double.parseDouble(scanner.nextLine());
            if (valorSaque <= conta.getSaldo()) {
                conta.setSaldo(conta.getSaldo() - valorSaque);
                System.out.println("Saque realizado com sucesso. Novo saldo: " + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Operação de saque cancelada.");
        }
    }

    private void realizarDeposito(Scanner scanner, Conta conta) {
        System.out.println("Digite o valor para depósito:");
        try {
            double valorDeposito = Double.parseDouble(scanner.nextLine());
            conta.setSaldo(conta.getSaldo() + valorDeposito);
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + conta.getSaldo());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Operação de depósito cancelada.");
        }
    }

    private String obterEntradaValida(Scanner scanner, String mensagem, boolean apenasNumeros) {
        String entrada;
        while (true) {
            System.out.println(mensagem);
            entrada = scanner.nextLine();
            if (apenasNumeros && !entrada.matches("[0-9/]+")) {
                System.out.println("Entrada inválida. Por favor, digite apenas números e barras (/) para a data de nascimento.");
            } else if (!apenasNumeros && entrada.matches(".*\\d+.*")) {
                System.out.println("Entrada inválida. Por favor, não inclua números.");
            } else {
                break;
            }
        }
        return entrada;
    }

    private String obterEntradaValida(Scanner scanner, boolean apenasNumeros) {
        String entrada;
        while (true) {
            entrada = scanner.nextLine();
            if (apenasNumeros && !entrada.matches("\\d+")) {
                System.out.println("Entrada inválida. Por favor, digite apenas números.");
            } else if (!apenasNumeros && entrada.matches(".*\\d+.*")) {
                System.out.println("Entrada inválida. Por favor, não inclua números.");
            } else {
                break;
            }
        }
        return entrada;
    }
}
