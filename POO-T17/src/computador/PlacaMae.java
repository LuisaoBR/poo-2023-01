package computador;

public class PlacaMae extends Dispositivo {
	
	private String tipo;
	private boolean isPciExpress;
	
	public PlacaMae(String numSerie,String fabricante,String tipo,boolean isPciExpress) {
		super(numSerie,fabricante);
		this.tipo = tipo;
		this.isPciExpress = isPciExpress;
	}
	
	

	@Override
	public String toString() {
		return "PlacaMae [tipo=" + tipo + ", isPciExpress=" + isPciExpress + "]";
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPciExpress() {
		return isPciExpress;
	}

	public void setPciExpress(boolean isPciExpress) {
		this.isPciExpress = isPciExpress;
	}
	
	

}
