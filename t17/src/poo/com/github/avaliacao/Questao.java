package poo.com.github.avaliacao;

public class Questao {

	private String enunciado;
	private String numero;
	private String gabarito;

	public Questao(String enunciado, String numero, String gabarito) {
		this.enunciado = enunciado;
		this.numero = numero;
		this.gabarito = gabarito;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}

	@Override
	public String toString() {
		return "Questao [enunciado=" + enunciado + ", numero=" + numero + ", gabarito=" + gabarito + "]";
	}

}
