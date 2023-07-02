package aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aviao {
	
	private int capacidadePassageiros;
	private String companhiaAerea;
	List <Voo> voos = new ArrayList<>();
	List <Lugar> listaLugares = new ArrayList<>();
	
	public Aviao(int capacidadePassageiros,String companhiaAerea) {
		this.capacidadePassageiros = capacidadePassageiros;
		this.companhiaAerea = companhiaAerea;
	}
	
	public void addVoos(Voo voo) {
		voos.add(voo);
	}
	
	public void mostraVoos() {
		for(Voo elemento : voos) {
			System.out.println(elemento);
		}
	}
	
	public void addLugar(Lugar lugar) {
		listaLugares.add(lugar);
	}
	
	public void mostraLugares() {
		for(Lugar elemento : listaLugares) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Aviao [capacidadePassageiros=" + capacidadePassageiros + ", companhiaAerea=" + companhiaAerea + "]";
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	
	

}
