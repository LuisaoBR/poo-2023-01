package poo.com.github.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	List<Mesa> mesas = new ArrayList<>();
	private Data data;

	public Pessoa(String nome, Data data) {
		this.nome = nome;
		this.data = data;
	}

	public void addMesa(Mesa mesa) {
		mesas.add(mesa);
	}

	public void mostraMesas() {
		for (Mesa elemento : mesas) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", data=" + data + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
