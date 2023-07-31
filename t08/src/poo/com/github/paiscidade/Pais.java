package poo.com.github.paiscidade;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private String nome;
	private int populacao;
	List<Cidade> listaCidades = new ArrayList<>();

	public Pais(String nome, int populacao) {
		this.nome = nome;
		this.populacao = populacao;
	}

	public void addCidade(Cidade cidade) {
		listaCidades.add(cidade);
	}

	public void mostraCidades() {
		for (Cidade elemento : listaCidades) {
			if (elemento.isCapital() == true) {
				System.out.println("CAPITAL: " + elemento);
			} else {
				System.out.println(elemento);
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

}
