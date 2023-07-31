package poo.com.github.aeroporto;

public class Voo {

	private int codigo;
	private int numPassageiros;

	public Voo(int codigo, int numPassageiros) {
		this.codigo = codigo;
		this.numPassageiros = numPassageiros;
	}

	@Override
	public String toString() {
		return "Voo [codigo=" + codigo + ", numPassageiros=" + numPassageiros + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

}
