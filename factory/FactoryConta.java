package br.com.cosmolustosa.factory;

public class FactoryConta {
    public static Conta getConta(int numero, int agencia, String titular, TipoConta tipoConta){
        if(tipoConta == TipoConta.CORRENTE){
            return new ContaCorrente(numero, agencia,titular);
        }else if(tipoConta == TipoConta.POUPANCA){
            return new ContaPoupanca(numero, agencia, titular);
        }else{
            return new ContaSalario(numero, agencia, titular);
        }

    }

}
