package io.github.mariazevedo88.solid.srp;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mockito.Mockito;

public class TesteSRP {
	
	private static final Logger log = LogManager.getLogger(TesteSRP.class);
	
	public static void main(String[] args) throws SQLException {
		
		FuncionarioDAO daoFalso = Mockito.mock(FuncionarioDAO.class);
		
		Funcionario funcionario = new Funcionario(1, "Mariana", 4000, Cargo.DESENVOLVEDOR_SENIOR);
		double salarioCalculado = funcionario.calculaSalario();
		
		daoFalso.salva(funcionario);
		
		log.info(funcionario);
		log.info("Salario com descontos: " + salarioCalculado);
	}

}
