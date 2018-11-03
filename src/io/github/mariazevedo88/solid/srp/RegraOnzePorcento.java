package io.github.mariazevedo88.solid.srp;

public class RegraOnzePorcento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.11);
	}

}
