package campeonato.model;

public class Jogo {
	
	private int cod;
	private String resultado;
	private Time time_a, time_b;
	
	public Jogo(int cod, String resultado, Time time_a, Time time_b) {
		this.setCod(cod);
		this.setResultado(resultado);
		this.setTime_a(time_a);
		this.setTime_b(time_b);
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

	public Time getTime_b() {
		return time_b;
	}

	public void setTime_b(Time time_b) {
		this.time_b = time_b;
	}

	public Time getTime_a() {
		return time_a;
	}

	public void setTime_a(Time time_a) {
		this.time_a = time_a;
	}
	
	
}
