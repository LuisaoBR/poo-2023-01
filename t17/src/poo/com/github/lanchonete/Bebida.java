package poo.com.github.lanchonete;

public class Bebida {

	private String tipo;
	private String sabor;

	public Bebida(String tipo, String sabor) {
		this.tipo = tipo;
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Bebida [tipo=" + tipo + ", sabor=" + sabor + "]";
	}

}
