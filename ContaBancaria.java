package figures;

public class ContaBancaria {
    private String tipoConta;
    private double saldo;

    public ContaBancaria(String tipoConta, double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na conta " + tipoConta);
        } else {
            System.out.println("Saldo insuficiente na conta " + tipoConta);
        }
    }
}
