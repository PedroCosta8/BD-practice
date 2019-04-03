package campeonato.model;

public class Jogo {
	
	private int cod;
	private String resultado;
	private int time_a, time_b; //substituir pela classe Time futuramente
	
	public Jogo(int cod, String resultado, int time_a, int time_b) {
		this.setCod(cod);
		this.setResultado(resultado);
		this.setTimeA(time_a);
		this.setTimeB(time_b);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getTimeB() {
		return time_b;
	}

	public void setTimeB(int time_b) {
		this.time_b = time_b;
	}

	public int getTimeA() {
		return time_a;
	}

	public void setTimeA(int time_a) {
		this.time_a = time_a;
	}
	
	
}
