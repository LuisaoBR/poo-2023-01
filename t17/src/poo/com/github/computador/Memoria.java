package poo.com.github.computador;

public class Memoria extends Dispositivo {

	private double capacidade;
	private String tipo;

	public Memoria(String numSerie, String fabricante, double capacidade, String tipo) {
		super(numSerie, fabricante);
		this.capacidade = capacidade;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Memoria [capacidade=" + capacidade + ", tipo=" + tipo + "]";
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
