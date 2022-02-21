public class ContaCorrente extends Conta {

    public ContaCorrente(){
         
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** EXTRATO CONTA CORRENTE ***");
        super.imprimirInfos();  
    }
}
