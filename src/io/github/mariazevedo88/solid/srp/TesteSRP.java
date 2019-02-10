package io.github.mariazevedo88.solid.srp;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.mockito.Mockito;

public class TesteSRP {
	
	private static final Logger logger = Logger.getLogger(TesteSRP.class);
	
	public static void main(String[] args) throws SQLException {
		
		FuncionarioDAO daoFalso = Mockito.mock(FuncionarioDAO.class);
		
		Funcionario funcionario = new Funcionario(1, "Mariana", 4000, Cargo.DESENVOLVEDOR_SENIOR);
		double salarioCalculado = funcionario.calculaSalario();
		
		daoFalso.salva(funcionario);
		
		logger.info(funcionario);
		logger.info("Salario com descontos: " + salarioCalculado);
	}

}
