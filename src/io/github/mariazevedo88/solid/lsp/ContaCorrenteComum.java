package io.github.mariazevedo88.solid.lsp;

public class ContaCorrenteComum {

	private GerenciadorDeContas gerenciador;

    public ContaCorrenteComum() {
        this.gerenciador = new GerenciadorDeContas();
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }
    
    public void saca(double valor) {
    	this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void rende() {
        this.gerenciador.rende(0.02);
    }  
}
