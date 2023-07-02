package lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Garconete {
	
	private String nome;
	private int idade;
	List <Pedido> listaPedidos = new ArrayList<>();
	
	public Garconete(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void coletaPedido(Pedido pedido) {
		listaPedidos.add(pedido);
	}
	
	public void mostraPedidos() {
		for(Pedido elemento : listaPedidos) {
			System.out.println(elemento);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Garconete [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
