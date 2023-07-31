package poo.com.github.herancaagregacao;

public class Casa extends Moradia {

	private int numero;

	public Casa(String cep, String endereco, int qtmoradores, int numero) {
		super(cep, endereco, qtmoradores);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Casa [numero=" + numero + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
