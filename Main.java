package figures;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria("Corrente", 1000.0);
        ContaBancaria contaPoupanca = new ContaBancaria("Poupança", 500.0);
        ContaBancaria contaInvestimento = new ContaBancaria("Investimento", 2000.0);

        contaCorrente.sacar(800.0);
        contaPoupanca.sacar(600.0);
        contaInvestimento.sacar(2200.0);
    }
}
