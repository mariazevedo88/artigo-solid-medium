package io.github.mariazevedo88.solid.lsp;

public class ContaSalario {
	
	private GerenciadorDeContas gerenciador;
	
	public ContaSalario() {
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
    
    @Override
    public String toString() {
    	return "Saldo conta salario -> " + this.getSaldo();
    }
}
