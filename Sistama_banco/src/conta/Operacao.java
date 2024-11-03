package conta;

import banco.Conta;

public class Operacao {
    public static void debitar(Conta conta, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println(" Débito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println(" Valor de débito inválido ou saldo insuficiente.");
        }
    }

    public static void creditar(Conta conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println(" Crédito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println(" Valor de crédito inválido.");
        }
    }

    public static void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor > 0 && valor <= contaOrigem.getSaldo()) {
            debitar(contaOrigem, valor);
            creditar(contaDestino, valor);
            System.out.println(" Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println(" Transferência inválida: saldo insuficiente ou valor negativo.");
        }
    }
    
    public static void depositar(Conta conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public static void sacar(Conta conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public static void aplicarJuros(Conta conta, double taxaJuros) {
        double juros = conta.getSaldo() * (taxaJuros / 100);
        conta.setSaldo(conta.getSaldo() + juros);
        System.out.println(" Juros de R$" + juros + " aplicados.");
    }
}

