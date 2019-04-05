package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import campeonato.connection.ConexaoDB;
import campeonato.model.Jogador;

public class JogadorDAO implements DaoInterface{

	@Override
	public void salvar(Object o) {
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
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Object> listar() {
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
