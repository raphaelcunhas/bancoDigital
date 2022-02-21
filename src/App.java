public class App {
    public static void main(String[] args) throws Exception {
        Cliente raphael = new Cliente();
        raphael.setNome("Raphel Cunha");
        Conta cc = new ContaCorrente(raphael);
        Conta poupanca = new ContaPoupanca(raphael);
        
        //cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
