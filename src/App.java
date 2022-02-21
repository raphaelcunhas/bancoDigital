
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = ler.next();
        novoCliente.setNome(nomeCliente);
        // cria conta p/ cliente
        Conta poupanca = new ContaPoupanca(novoCliente);
        Conta cc = new ContaCorrente(novoCliente);
        Scanner scan = new Scanner(System.in);
        int menuCliente = 0;
        while (menuCliente != 5) {
            System.out.println("\n*** TELA CLIENTES ***");
            System.out.println("1- Sacar");
            System.out.println("2- Depositar");
            System.out.println("3- Transferir");
            System.out.println("4- Extrato");
            System.out.println("5- Finalizar");
            System.out.println("Digite uma opcao: ");
            menuCliente = scan.nextInt();
            System.out.println("\n");
            switch (menuCliente) {
                case 1:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scan.nextDouble();
                    cc.sacar(valorSaque);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scan.nextDouble();
                    cc.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTrans = scan.nextDouble();
                    cc.transferir(valorTrans, poupanca);
                    break;
                case 4:
                    cc.imprimirExtrato();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}
