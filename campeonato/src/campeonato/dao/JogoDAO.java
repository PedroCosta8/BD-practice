package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import campeonato.connection.ConexaoDB;
import campeonato.model.Jogo;


public class JogoDAO implements DaoInterface{

	@Override
	public void salvar(Object o) {
		PreparedStatement prestm;
		Jogo jogo = (Jogo) o;
		try {
			String sql = "ISERT INTO Jogo VALUES(?,?,?,?)";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setLong(1, jogo.getCod());
			prestm.setString(2, jogo.getResultado());
			prestm.setLong(3, jogo.getTimeA());
			prestm.setLong(4, jogo.getTimeB());
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
