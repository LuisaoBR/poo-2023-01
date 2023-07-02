package xadrez;

import java.util.ArrayList;
import java.util.List;

public class Partida {
	
	List <Lance> listaLances = new ArrayList<>();
	private String numPartida;
	
	public Partida(String numPartida) {
		this.numPartida = numPartida;
	}

	public String getNumPartida() {
		return numPartida;
	}

	public void setNumPartida(String numPartida) {
		this.numPartida = numPartida;
	}

	@Override
	public String toString() {
		return "Partida [numPartida=" + numPartida + "]";
	}
	
	public void addLance(Lance lance) {
		listaLances.add(lance);
	}
	
	public void mostraLances() {
		for(Lance elemento : listaLances) {
			System.out.println(elemento.toString());
			
		}
	}

}
