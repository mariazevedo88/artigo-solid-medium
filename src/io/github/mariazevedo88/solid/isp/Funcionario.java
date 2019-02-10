package io.github.mariazevedo88.solid.isp;

public abstract class Funcionario implements Convencional{
	
	private String nome;
	private double salario;
	
	@Override
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
