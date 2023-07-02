package aeroporto;

public class Passageiro {
	
	private String bilhete;
	private Lugar lugar;
	
	public Passageiro(String bilhete) {
		this.bilhete = bilhete;
	}

	public String getBilhete() {
		return bilhete;
	}

	public void setBilhete(String bilhete) {
		this.bilhete = bilhete;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Passageiro [bilhete=" + bilhete + ", lugar=" + lugar + "]";
	}
	
	

}
