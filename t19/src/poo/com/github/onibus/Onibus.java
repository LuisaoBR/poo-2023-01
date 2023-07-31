package poo.com.github.onibus;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
	private String marca;
	private String modelo;
	List<Viagem> viagens = new ArrayList<>();

	public Onibus(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void addViagem(Viagem viagem) {
		viagens.add(viagem);
	}

	public void mostraViagens() {
		for (Viagem elemento : viagens) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Onibus [marca=" + marca + ", modelo=" + modelo + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
