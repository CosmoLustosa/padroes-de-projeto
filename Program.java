package br.com.cosmolustosa;

import br.com.cosmolustosa.factory.Conta;
import br.com.cosmolustosa.factory.FactoryConta;
import br.com.cosmolustosa.factory.TipoConta;

public class Program {
    public static void main(String[] args) {
        Conta conta = FactoryConta.getConta(123, 256, "Cosmo Lutosa", TipoConta.POUPANCA);
        conta.depositar(500.00);
        conta.depositar(523);
        System.out.println("Juros: "+conta.calculaJuros());
        System.out.println("Emprestimo: " +conta.calculaValorEmprestimo());

        System.out.println("============= Conta Salario ==========");

        Conta contaSalario = FactoryConta.getConta(123, 256, "Cosmo Lutosa", TipoConta.SALARIO);
        contaSalario.depositar(500.00);
        contaSalario.depositar(523);
        System.out.println("Juros: "+contaSalario.calculaJuros());
        System.out.println("Emprestimo: " +contaSalario.calculaValorEmprestimo());
        System.out.println("============= Conta Corrente ==========");

        Conta contaCorrente = FactoryConta.getConta(123, 256, "Cosmo Lutosa", TipoConta.CORRENTE);
        contaCorrente.depositar(500.00);
        contaCorrente.depositar(523);
        System.out.println("Juros: "+contaCorrente.calculaJuros());
        System.out.println("Emprestimo: " +contaCorrente.calculaValorEmprestimo());

        System.out.println("============= Conta Corrente após depósito ==========");

        //deposintando 5000 na conta corrente
        contaCorrente.depositar(5000);
        System.out.println("Juros: "+contaCorrente.calculaJuros());
        System.out.println("Emprestimo: " +contaCorrente.calculaValorEmprestimo());

    }
}
