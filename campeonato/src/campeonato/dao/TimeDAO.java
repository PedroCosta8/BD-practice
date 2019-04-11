package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import campeonato.connection.ConexaoDB;
import campeonato.model.Time;

public class TimeDAO implements DaoInterface{

	@Override
	public String salvar(Object o){
		PreparedStatement prestm;
		Time time = (Time) o;
		try {
			String sql = "INSERT INTO Time VALUES(?, ?, ?)";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setLong(1, time.getCod());
			prestm.setString(2, time.getNome());
			prestm.setString(3, time.getData_fundacao());
			prestm.executeUpdate();
			return "Salvo com sucesso";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Impossivel salvar dados";
		}
	}

	@Override
	public String listar() {
		PreparedStatement prestm;
		String result = "\nTime | Data de Fundação\n";
		try {
			String sql = "SELECT * FROM Time";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			ResultSet rs = prestm.executeQuery(sql);
			while(rs.next()) {
				String nome = rs.getString(2);
			    String fund = rs.getString(3);
			    result += nome + " | " + fund + "\n";
			}
			return result;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String deletar(int cod) {
		PreparedStatement prestm;
		try {
			String sql = "DELETE FROM Time WHERE cod="+cod;
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.executeUpdate();
			return "Deletado com sucesso";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Impossível deletar os dados";
		}
	}

	@Override
	public String atualizar(Object o) {
		PreparedStatement prestm;
		Time time = (Time) o;
		try {
			String sql = "UPDATE Time SET nome=?, data_fundacao=? WHERE cod=?";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setString(1,time.getNome());
			prestm.setString(2, time.getData_fundacao());
			prestm.setInt(3, time.getCod());
			prestm.executeUpdate();
			return "Atualizado com sucesso";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Impossível atualizar os dados";
		}
		
	}

}
