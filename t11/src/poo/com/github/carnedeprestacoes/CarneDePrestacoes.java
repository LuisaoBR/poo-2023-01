package poo.com.github.carnedeprestacoes;

public class CarneDePrestacoes {

	private Prestacao prestacao;
	private Compra compra;
	private int numeroCarne;

	CarneDePrestacoes(int numeroCarne, Prestacao prestacao, Compra compra) {
		this.numeroCarne = numeroCarne;
		this.prestacao = prestacao;
		this.compra = compra;
	}

	public Prestacao getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(Prestacao prestacao) {
		this.prestacao = prestacao;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public int getNumeroCarne() {
		return numeroCarne;
	}

	public void setNumeroCarne(int numeroCarne) {
		this.numeroCarne = numeroCarne;
	}

}
