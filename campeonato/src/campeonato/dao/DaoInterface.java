package campeonato.dao;


public interface DaoInterface {

	public String salvar(Object o);
	public String listar();
	public String deletar(int cod);
	public String atualizar(Object o);
	
}
