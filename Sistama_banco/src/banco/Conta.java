package banco;

public class Conta {
    private int    numero;
    private double saldo;

    public Conta(int numero, double saldoConta) {
        this.numero = numero;
        this.saldo  = saldoConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldoConta) { 
        this.saldo = saldoConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

