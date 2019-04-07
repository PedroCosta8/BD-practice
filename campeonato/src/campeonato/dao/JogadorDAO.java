package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import campeonato.connection.ConexaoDB;
import campeonato.model.Jogador;

public class JogadorDAO implements DaoInterface{

	@Override
	public String salvar(Object o) {
		PreparedStatement prestm;
		Jogador jogador = (Jogador) o;
		try {
			String sql = "INSERT INTO Jogador VALUES(?,?,?,?)";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setLong(1, jogador.getCod());
			prestm.setString(2, jogador.getNome());
			prestm.setLong(3, jogador.getIdade());
			prestm.setLong(4, jogador.getTime());
			prestm.executeUpdate();
			ConexaoDB.fecharConexao();
			return "";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "";
		}
		
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

}
