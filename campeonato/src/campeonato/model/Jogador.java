package campeonato.model;

public class Jogador {

	private int cod;
	private String nome;
	private int idade;
	private Time time;
	
	public Jogador(int cod, String nome, int idade, Time time) {
		this.setCod(cod);
		this.setNome(nome);
		this.setIdade(idade);
		this.setTime(time);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
