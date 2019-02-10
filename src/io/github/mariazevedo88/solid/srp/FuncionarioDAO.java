package io.github.mariazevedo88.solid.srp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class FuncionarioDAO {
	
	private static final Logger logger = Logger.getLogger(FuncionarioDAO.class);

	public void salva(Funcionario funcionario) throws SQLException{
		
		ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
		connectionDAO.setDbms("mysql");
		connectionDAO.setServerName("localhost");
		connectionDAO.setPortNumber("8080");
		connectionDAO.setDbName("mock");
	   
		try (Connection connection = connectionDAO.createConnection();
			 Statement stmt = connection.createStatement();) {
			
			String sql = "insert into funcionario (id, nome, salario) values (" + funcionario.getId() + "," +
					funcionario.getNome() + "," + funcionario.getSalario() + ")";
			int rs = stmt.executeUpdate(sql);
			
			if (rs == 1){
				logger.info("Funcionario inserido com sucesso.");
			}
		} catch (SQLException e) {
			logger.error("Nenhum funcionario inserido." + e);
		}
	}
}
