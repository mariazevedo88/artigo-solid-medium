package io.github.mariazevedo88.solid.srp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {

	public void salva(Funcionario funcionario){
		
		ConnectionDAO connectionDAO = new ConnectionDAO();
	    Connection connection = connectionDAO.createConnection();
	    
		try {
			Statement stmt = connection.createStatement();
			String sql = "insert into funcionario (id, nome, salario) values (" + funcionario.getId() + "," +
					funcionario.getNome() + "," + funcionario.getSalario() + ")";
			int rs = stmt.executeUpdate(sql);
			
			if (rs == 1){
				System.out.println("Funcionario inserido com sucesso.");
			}else if (rs == 0){
				System.out.println("Nenhum funcionario inserido.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
