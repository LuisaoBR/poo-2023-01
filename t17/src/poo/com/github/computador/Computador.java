package poo.com.github.computador;

import java.util.ArrayList;
import java.util.List;

public class Computador {

	private String fabricante;
	private String numSerie;
	private String modelo;
	List<Dispositivo> listaDispositivos = new ArrayList<>();

	public Computador(String fabricante, String numSerie, String modelo) {
		this.fabricante = fabricante;
		this.numSerie = numSerie;
		this.modelo = modelo;
	}

	public void addDispositivo(Dispositivo dispositivo) {
		listaDispositivos.add(dispositivo);
	}

	@Override
	public String toString() {
		return "Computador [fabricante=" + fabricante + ", numSerie=" + numSerie + ", modelo=" + modelo + "]";
	}

	public void mostraDispositivos() {
		for (Dispositivo elemento : listaDispositivos) {
			System.out.println(elemento);
		}
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
