package io.github.mariazevedo88.solid.srp;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private double salario;
	private Cargo cargo;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}
	
}
