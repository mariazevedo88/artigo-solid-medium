package io.github.mariazevedo88.solid.isp;

public class Vendedor extends Funcionario implements Comissionavel{

	private double salario;
	private int totalVendas;
	
	public Vendedor(double salario, int totalVendas) {
		this.salario = salario;
		this.totalVendas = totalVendas;
	}
	
	@Override
	public double getSalario() {
		return this.salario + this.getComissao();
	}

	@Override
	public double getComissao() {
		return this.totalVendas * 0.2;
	}

}
