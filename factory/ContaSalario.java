package br.com.cosmolustosa.factory;

import br.com.cosmolustosa.strategy.GeraEmprestimo;

public class ContaSalario extends Conta{
    GeraEmprestimo emprestimo;

    public ContaSalario(int numero, int agencia, String titular) {
       super(numero, agencia, titular);
       setTaxaDeJuros(3.5);
    }


    @Override
    public double calculaValorEmprestimo() {
        return (this.getSaldo()/this.getTaxaDeJuros())*0.5;
    }
}
