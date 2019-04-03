package campeonato.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import campeonato.connection.ConexaoDB;
import campeonato.model.Time;

public class TimeDAO implements DaoInterface{

	@Override
	public void salvar(Object o){
		PreparedStatement prestm;
		Time time = (Time) o;
		try {
			String sql = "ISERT INTO Time VALUES(?,?,?)";
			prestm = ConexaoDB.getConexao().prepareStatement(sql);
			prestm.setLong(1, time.getCod());
			prestm.setString(2, time.getNome());
			prestm.setString(3, time.getData_fundacao());
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
