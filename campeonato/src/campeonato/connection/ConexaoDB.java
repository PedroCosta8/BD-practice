package campeonato.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB{
	
	private static Connection connection = null;
	private static String status = "Não conectou...";
	
	public static Connection getConexao() throws SQLException, ClassNotFoundException {
		if(connection == null || connection.isClosed()) {
			connection = criarConexao();
		}
		return connection;
	}
	
	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
	        String user = "root";
	        String senha = "senha";
			String url = "jdbc:mysql://localhost:3306/campeonato";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, senha);
			if (connection != null) {
				 
	            status = ("STATUS--->Conectado com sucesso!");

	        } else {

	            status = ("STATUS--->Não foi possivel realizar conexão");

	        }
			return connection;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	public static boolean fecharConexao() throws ClassNotFoundException {
		try {
			ConexaoDB.getConexao().close();
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
