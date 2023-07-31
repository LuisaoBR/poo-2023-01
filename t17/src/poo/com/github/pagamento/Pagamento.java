package poo.com.github.pagamento;

public class Pagamento {

	private double valor;

	public Pagamento() {

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + "]";
	}

}
