package poo.com.github.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

	private int capacidadeAvioes;
	private String endereco;
	List<Operacao> listaOperacoes = new ArrayList<>();

	public Aeroporto(int capacidadeAvioes, String endereco) {
		this.capacidadeAvioes = capacidadeAvioes;
		this.endereco = endereco;
	}

	public void addOperacao(Operacao operacao) {
		listaOperacoes.add(operacao);
	}

	@Override
	public String toString() {
		return "Aeroporto [capacidadeAvioes=" + capacidadeAvioes + ", endereco=" + endereco + "]";
	}

	public void mostraOperacoes() {
		for (Operacao elemento : listaOperacoes) {
			System.out.println(elemento);
		}
	}

	public int getCapacidadeAvioes() {
		return capacidadeAvioes;
	}

	public void setCapacidadeAvioes(int capacidadeAvioes) {
		this.capacidadeAvioes = capacidadeAvioes;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
