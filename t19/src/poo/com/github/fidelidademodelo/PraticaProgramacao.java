package poo.com.github.fidelidademodelo;

public class PraticaProgramacao {
	private String linguagem;
	private double horas;

	public PraticaProgramacao(String linguagem, double horas) {
		this.linguagem = linguagem;
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "PraticaProgramacao [linguagem=" + linguagem + ", horas=" + horas + "]";
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

}
