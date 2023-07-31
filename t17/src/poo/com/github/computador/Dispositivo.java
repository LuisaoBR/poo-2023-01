package poo.com.github.computador;

public class Dispositivo {

	private String numSerie;
	private String fabricante;

	public Dispositivo(String numSerie, String fabricante) {
		this.numSerie = numSerie;
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Dispositivo [numSerie=" + numSerie + ", fabricante=" + fabricante + "]";
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
