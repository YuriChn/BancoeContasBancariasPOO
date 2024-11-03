package banco;

import conta.Operacao;

public class ContaEstudantil extends Conta {
    private double  limite;
    private double  taxaJuros;
    private boolean isTaxaIsenta;

    public ContaEstudantil(int numero, double saldo, double limiteEstudantil, double taxaJuros, boolean isTaxaIsenta) {
        super(numero, saldo);
        this.limite = limiteEstudantil;
        this.taxaJuros = taxaJuros;
        this.isTaxaIsenta = isTaxaIsenta;
    }

    public void fazerOperacao(Conta contaDestino, double valor, String tipoOperacao) {
        if (!(valor > 0 && valor <= limite)) {
            System.out.println("Valor de operação inválido ou excede o limite estudantil.");
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
        if (!isTaxaIsenta) {
            Operacao.aplicarJuros(this, taxaJuros);
        }
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
    
    
    public boolean getIsTaxaIsenta() {
        return isTaxaIsenta;
    }

    public void setIsTaxaIsenta(boolean taxa) {
        this.isTaxaIsenta = taxa;
    }
}


