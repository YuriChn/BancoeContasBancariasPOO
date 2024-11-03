package banco;

import conta.Operacao;

public class ContaEspecial extends Conta {
    private double limite;
    private double taxaJuros;

    public ContaEspecial(int numero, double saldo, double limiteCredito, double taxaJuros) {
        super(numero, saldo);
        this.limite    = limiteCredito;
        this.taxaJuros = taxaJuros;
    }

    public void fazerOperacao(Conta contaDestino, double valor, String tipoOperacao) {
        if (!(valor > 0 && valor <= limite)) {
            System.out.println("Valor de operação inválido ou excede o limite especial.");
            return;
        }

        switch (tipoOperacao.toLowerCase()) {
            case "debito":
                Operacao.debitar(this, valor);
                break;
            case "credito":
                Operacao.creditar(this, valor);
                break;
            case "transferir":
                Operacao.transferir(this, contaDestino, valor);
                break;
            default:
                System.out.println("Tipo de operação inválido.");
        }
    }

    public void aplicarJurosNoCredito() {
        Operacao.aplicarJuros(this, taxaJuros);
    }
    
    public double getLimiteEspecial() {
        return limite;
    }

    public void setLimiteEspecial(double limiteCredito) {
        this.limite = limiteCredito;
    }
    
    public double getTaxaJuros() {
        return limite;
    }

    public void setTaxaJuros(double taxa) {
        this.taxaJuros = taxa;
    }
}
