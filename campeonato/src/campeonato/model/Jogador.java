package campeonato.model;

public class Jogador {

	private int cod;
	private String nome;
	private int idade;
	private int time; //substituir no futuro pela classe time
	
	public Jogador(int cod, String nome, int idade, int time) {
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

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
