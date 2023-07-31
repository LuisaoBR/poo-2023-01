
public class Preco {

	private String moeda;
	private double valor;

	Preco(String moeda, double valor) {
		this.moeda = moeda;
		this.valor = valor;
	}

	public void mostraPreco() {
		System.out.println("O preco consiste de: ");
		System.out.println("Moeda: " + this.moeda);
		System.out.println("Valor: " + this.valor);
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
