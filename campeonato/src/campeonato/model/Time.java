package campeonato.model;

public class Time {

	private int cod;
	private String nome;
	private String data_fundacao;
	
	public Time(int cod, String nome, String data_fundacao) {
		this.setCod(cod);
		this.setNome(nome);
		this.setData_fundacao(data_fundacao);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_fundacao() {
		return data_fundacao;
	}

	public void setData_fundacao(String data_fundacao) {
		this.data_fundacao = data_fundacao;
	}
	
}
