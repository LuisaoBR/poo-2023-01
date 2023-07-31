package poo.com.github.feriados;

public class Calendario {
	private String ano;

	public Calendario(String ano) {
		this.ano = ano;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Calendario [ano=" + ano + "]";
	}

}
