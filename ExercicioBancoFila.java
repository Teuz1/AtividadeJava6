package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioBancoFila {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    retirarCliente(filaClientes);
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n*******************************************************************************");
        System.out.println("1- adicionar cliente na fila");
        System.out.println("2- Listar todos os clientes");
        System.out.println("3- retirar cliente da fila");
        System.out.println("0- sair");
        System.out.println("*******************************************************************************");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        filaClientes.offer(nome);
        System.out.println("\nFila: \n" + filaClientes);
        System.out.println("Cliente Adicionado!");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        System.out.println("\nLista de Clientes na Fila: \n" + filaClientes);
    }

    private static void retirarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("\nA Fila está vazia!");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("\nFila: \n" + filaClientes);
            System.out.println("O Cliente foi Chamado!");
        }
    }
}
