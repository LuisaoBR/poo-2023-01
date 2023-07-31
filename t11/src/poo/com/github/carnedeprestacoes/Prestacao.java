package poo.com.github.carnedeprestacoes;

import java.util.ArrayList;
import java.util.List;

public class Prestacao {

	private String data;
	private double valor = 0;
	private int codigo;
	private Produto produto;
	List<Produto> listaProdutos = new ArrayList<>();

	Prestacao(String data, int codigo) {
		this.data = data;
		this.codigo = codigo;
	}

	public void compra(Produto produto) {
		listaProdutos.add(produto);
		this.valor += produto.getPreco();
	}

	public void mostraCompras() {
		for (Produto elemento : listaProdutos) {
			System.out.println(elemento);
		}
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
