
package desafio100Dias.dia34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql{
	
	public static Connection getConexao(){
		try {
			final String url = "jdbc:mysql://localhost:3306/sistema";
			final String usuario = "root";
			final String senha = "";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
