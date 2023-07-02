package computador;

public class Teclado extends Dispositivo {
	
	private int quantidadeTeclas;
	private boolean isMecanico;
	
	public Teclado(String numSerie,String fabricante,int quantidadeTeclas,boolean isMecanico) {
		super(numSerie,fabricante);
		this.quantidadeTeclas = quantidadeTeclas;
		this.isMecanico = isMecanico;
	}
	
	

	@Override
	public String toString() {
		return "Teclado [quantidadeTeclas=" + quantidadeTeclas + ", isMecanico=" + isMecanico + "]";
	}



	public int getQuantidadeTeclas() {
		return quantidadeTeclas;
	}

	public void setQuantidadeTeclas(int quantidadeTeclas) {
		this.quantidadeTeclas = quantidadeTeclas;
	}

	public boolean isMecanico() {
		return isMecanico;
	}

	public void setMecanico(boolean isMecanico) {
		this.isMecanico = isMecanico;
	}
	
	

}
