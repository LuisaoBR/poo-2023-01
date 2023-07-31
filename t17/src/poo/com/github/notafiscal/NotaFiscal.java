package poo.com.github.notafiscal;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	List<Item> itens = new ArrayList<>();
	private int numero;
	private double valorTotal;

	public NotaFiscal(int numero) {
		this.numero = numero;
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public void mostraItens() {
		for (Item elemento : itens) {
			System.out.println(elemento);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "NotaFiscal [numero=" + numero + ", valorTotal=" + valorTotal + "]";
	}

}
