package poo.com.github.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	List<Pessoa> pessoas = new ArrayList<>();
	private Data data;

	public Mesa(Data data) {
		this.data = data;
	}

	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void mostraPessoas() {
		for (Pessoa elemento : pessoas) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Mesa [data=" + data + "]";
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
