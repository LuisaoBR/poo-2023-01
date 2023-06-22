package CarneDePrestacoes;

public class Produto {
	
	private int quantidade;
	private String nome;
	private double preco;
	
	Produto(int quantidade, String nome, double preco){
		this.quantidade = quantidade;
		this.nome = nome;
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
