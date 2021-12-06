package banco;

public class Main {
    public static void main(String[] args){

        Cliente fernando = new Cliente();
        fernando.setNome("Fernando");

        Conta ccf = new ContaCorrente(fernando);
        Conta cpf = new ContaPoupanca(fernando);

        ccf.depositar(1000);
        ccf.imprimirExtrato();


        Cliente sabrina = new Cliente();
        sabrina.setNome("Sabrina");

        Conta ccs = new ContaPoupanca(sabrina);
        ccs.depositar(2000);
        ccs.imprimirExtrato();

        ccf.transferir(500, ccs);
        ccf.imprimirExtrato();
        ccs.imprimirExtrato();
    }
}
