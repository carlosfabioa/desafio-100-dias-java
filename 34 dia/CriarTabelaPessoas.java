package desafio100Dias.dia34;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas{

	public CriarTabelaPessoas() throws SQLException{
		Connection conexao = ConexaoMysql.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL, "
				+ "email VARCHAR(50)"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso");
		conexao.close();
		
	}

}
