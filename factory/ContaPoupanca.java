package br.com.cosmolustosa.factory;

import br.com.cosmolustosa.strategy.GeraEmprestimo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int agencia, String titular) {
        super(numero, agencia, titular);
        setTaxaDeJuros(1.5);
    }

    @Override
    public double calculaValorEmprestimo() {
        return (this.getSaldo()/this.getTaxaDeJuros())*0.8;
    }
}
