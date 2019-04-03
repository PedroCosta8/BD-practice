package campeonato.dao;

import java.util.ArrayList;

public interface DaoInterface {

	public void salvar(Object o);
	public ArrayList<Object> listar();
	public void deletar();
	public void atualizar();
	
}
