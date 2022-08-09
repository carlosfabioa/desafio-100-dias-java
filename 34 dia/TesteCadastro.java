package desafio100Dias.dia34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteCadastro{

	public static void main(String[] args) throws SQLException{
	
		Connection conexao = ConexaoMysql.getConexao();
		CriarTabelaPessoas pessoas =  new CriarTabelaPessoas();

	}

}
