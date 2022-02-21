
import java.util.List;
import java.util.Scanner;

public class Banco {
    private String nome;

    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public static void menuAdm() {

        int opcaoAdm = 0;
        while (opcaoAdm != 4) {
            System.out.println("\n\n ### SISBD - Sistema do Banco Digital ###");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Nova conta         |");
            System.out.println("                  |     2 - Cancelar conta      |");
            System.out.println("                  |     3 - Ir no SISTEMA CLIENTES        |");
            System.out.println("                  |     4 - Sair       |");
            System.out.println("                  =========================\n");
            try (Scanner ler = new Scanner(System.in)) {
                opcaoAdm = ler.nextInt();
            }
            System.out.print("\n");
            switch (opcaoAdm) {
                case 1:
                    Cliente novoCliente = new Cliente();
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = System.console().readLine();
                    novoCliente.setNome(nomeCliente);
                    // cria conda p/ cliente
                    // Conta cc = new ContaCorrente(novoCliente);
                    // Conta poupanca = new ContaPoupanca(novoCliente);
                    break;
                case 2:
                    break;
                case 3:
                    menuCliente();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

    public static void menuCliente() {
        try (Scanner scan = new Scanner(System.in)) {
            String menuCliente = "0";
            while (menuCliente != "6") {
                System.out.println("*** TELA CLIENTES ***");
                System.out.println("1- Sacar");
                System.out.println("2- Depositar");
                System.out.println("3- Transferir");
                System.out.println("4- Extrato");
                System.out.println("5- Voltar");
                System.out.println("6- Sair");
                System.out.println("Digite uma opcao: ");
                menuCliente = scan.nextLine();
                switch (menuCliente) {
                    case "1":

                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        menuAdm();
                        break;
                    case "6":
                        break;
                    default:
                        break;
                }
            }
        }
    }
}