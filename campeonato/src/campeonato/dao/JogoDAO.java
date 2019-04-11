package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import campeonato.connection.ConexaoDB;
import campeonato.model.Jogo;


public class JogoDAO implements DaoInterface{

	@Override
	public String salvar(Object o) {
		PreparedStatement prestm;
		Jogo jogo = (Jogo) o;
		try {
			String sql = "INSERT INTO Jogo VALUES(?,?,?,?)";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setLong(1, jogo.getCod());
			prestm.setString(2, jogo.getResultado());
			prestm.setLong(3, jogo.getTimeA());
			prestm.setLong(4, jogo.getTimeB());
			prestm.executeUpdate();
			ConexaoDB.fecharConexao();
			return "Salvo com sucesso";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Impossível Salvar dados";
		}
		
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar(int cod) {
		return null;
	}

	@Override
	public String atualizar(Object o) {
		return null;
		
	}

}
