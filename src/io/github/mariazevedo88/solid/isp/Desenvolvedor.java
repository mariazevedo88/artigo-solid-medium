package io.github.mariazevedo88.solid.isp;

public class Desenvolvedor extends Funcionario implements Convencional{

	private String nome;
	private double salario;
	
	public Desenvolvedor(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}
}
