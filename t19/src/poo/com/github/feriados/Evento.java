package poo.com.github.feriados;

public class Evento {
	private Calendario calendario;
	private int dia;
	private String descricao;

	public Evento(Calendario calendario, int dia, String descricao) {
		this.calendario = calendario;
		this.dia = dia;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Evento [calendario=" + calendario + ", dia=" + dia + ", descricao=" + descricao + "]";
	}

	public Calendario getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
