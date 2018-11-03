package io.github.mariazevedo88.solid.isp;

public class Desenvolvedor extends Funcionario implements Convencional{

	private double salario;
	
	public Desenvolvedor(double salario) {
		this.salario = salario;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}

}
