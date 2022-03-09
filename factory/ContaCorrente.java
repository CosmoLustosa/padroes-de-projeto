package br.com.cosmolustosa.factory;

import br.com.cosmolustosa.strategy.GeraEmprestimo;

public class ContaCorrente extends  Conta {

    public ContaCorrente(int numero, int agencia, String titular) {
        super(numero, agencia, titular);
        setTaxaDeJuros(6.5);
    }


    @Override
    public double calculaValorEmprestimo() {
        return (this.getSaldo()/this.getTaxaDeJuros())* 1.2;
    }

}
