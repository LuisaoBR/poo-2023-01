package aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Tripulacao {
	
	private int numPassageiros;
	private Piloto piloto;
	private CoPiloto copiloto;
	List <Aeromoca> aeromocas = new ArrayList<>();
	
	public Tripulacao(int numPassageiros,Piloto piloto,CoPiloto copiloto) {
		this.numPassageiros = numPassageiros;
		this.piloto = piloto;
		this.copiloto = copiloto;
	}
	
	public void addAeromoca(Aeromoca aeromoca) {
		aeromocas.add(aeromoca);
	}

	@Override
	public String toString() {
		return "Tripulacao [numPassageiros=" + numPassageiros + ", piloto=" + piloto + ", copiloto=" + copiloto + "]";
	}
	
	public void mostraAeromocas() {
		for(Aeromoca elemento : aeromocas) {
			System.out.println(elemento);
		}
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public CoPiloto getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(CoPiloto copiloto) {
		this.copiloto = copiloto;
	}
	
	

}
