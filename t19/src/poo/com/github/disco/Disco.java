package poo.com.github.disco;

import java.util.ArrayList;
import java.util.List;

public class Disco {

	List<Arquivo> arquivos = new ArrayList<>();
	private String capacidade;

	public Disco(String capacidade) {
		this.capacidade = capacidade;
	}

	public void addArquivo(Arquivo arquivo) {
		arquivos.add(arquivo);
	}

	public void mostraArquivos() {
		for (Arquivo elemento : arquivos) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Disco [capacidade=" + capacidade + "]";
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

}
