package io.github.mariazevedo88.solid.lsp;

public class GerenciadorDeContas {
	
	private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
    	if(valor <= this.saldo) {
    		this.saldo -= valor;
    	}else{
    		throw new IllegalArgumentException("Saldo insuficiente.");
    	}
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende(double taxa){
        this.saldo*= taxa;
    }  

}
