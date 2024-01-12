import java.util.Scanner;

public class Apliccadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encontrado;
        char opcao;
        int n = 0;
        String[] nome = new String[100];
        String[] cpf = new String[100];
        String[] cidadeDestino = new String[100];
        String[] paisDestino = new String[100];

        do {
            
            System.out.println("Bem-vindo à agência de viagem");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Visualizar cadastro do cliente");
            System.out.println("3 - Consultar cliente");
            System.out.println("4 - Cadastrar destino");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção De 1 a 5: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Informe a quantidade de clientes a ser cadastrado: ");
                    n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Insira o nome do cliente: ");
                        scanner.nextLine();  // Limpar o buffer do teclado
                        nome[i] = scanner.nextLine();

                        System.out.print("Insira o CPF: ");
                        cpf[i] = scanner.next();
                    }

                    System.out.println("\nDados cadastrados!!!\n");
                    break;

                case '2':
                    for (int i = 0; i < n; i++) {
                        System.out.println("Dados cadastrados ");
                        System.out.println("Nome: " + nome[i]);
                        System.out.println("CPF: " + cpf[i]);
                        
                    }
                    break;

                case '3':
                    System.out.print("Insira CPF do cliente para consulta: ");
                    String consulta = scanner.next();
                    encontrado = false;

                    for (int i = 0; i < n; i++) {
                        if (cpf[i].equals(consulta)) {
                            System.out.println("Cliente encontrado!!! ");
                            System.out.println("Nome consultado: " + nome[i]);
                            System.out.println("CPF: " + cpf[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("NOME NAO ENCONTRADO");
                    }
                    break;

                case '4':
                    for (int i = 0; i < n; i++) {
                        System.out.print("Informe o destino do cliente: ");
                        scanner.nextLine();  
                        cidadeDestino[i] = scanner.nextLine();

                        System.out.print("Informe o País de destino: ");
                        paisDestino[i] = scanner.nextLine();
                    }

                    System.out.println("\nDestino cadastrado !!!\n");
                    break;

                case '5':
                    System.out.println("Encerrado! Obrigado por utilizar nosso sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!!!!");
            }

        } while (opcao != '5');

        scanner.close();
    }
}
