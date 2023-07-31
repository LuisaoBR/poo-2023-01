package poo.com.github.notafiscal;

public class Item {

	private int quantidade;
	private double precoUnitario;
	private Produto produto;
	private NotaFiscal notafiscal;

	public Item(int quantidade, double precoUnitario, Produto produto, NotaFiscal notafiscal) {
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.produto = produto;
		this.notafiscal = notafiscal;
		this.notafiscal.setValorTotal(this.quantidade * this.precoUnitario);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Item [quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", produto=" + produto
				+ ", notafiscal=" + notafiscal + "]";
	}

}
