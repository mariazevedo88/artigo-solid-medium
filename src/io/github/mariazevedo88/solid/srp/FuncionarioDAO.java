package io.github.mariazevedo88.solid.srp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FuncionarioDAO {
	
	private static final Logger log = LogManager.getLogger(FuncionarioDAO.class);

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
				log.info("Funcionario inserido com sucesso.");
			}
		} catch (SQLException e) {
			log.error("Nenhum funcionario inserido." + e);
		}
	}
}
