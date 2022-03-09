package br.com.cosmolustosa.factory;

import br.com.cosmolustosa.strategy.GeraEmprestimo;

public abstract class Conta implements GeraEmprestimo {
    private int numero;
    private int agencia;
    private String titular;
    private double saldo = 0;
    private double taxaDeJuros;




    public Conta(int numero, int agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }
    public Conta(){

    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setTaxaDeJuros(double taxa){
        this.taxaDeJuros = taxa;
    }

    public String getTitular() {
        return titular;
    }

    public double getTaxaDeJuros(){
        return this.taxaDeJuros;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    public double calculaJuros(){
        return  (this.saldo * this.taxaDeJuros)/100.0;
    }

}
