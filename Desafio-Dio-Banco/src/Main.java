
public class Main {

    public static void main(String[] args) {
        Cliente Andre = new Cliente();
        Andre.setNome("André Luiz");

        Conta cc = new ContaCorrente(Andre);
        Conta poupanca = new ContaPoupanca(Andre);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}