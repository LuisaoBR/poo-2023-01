package poo.com.github.fidelidademodelo;

import java.util.ArrayList;
import java.util.List;

public class Programacao extends PraticaProgramacao {
	List<PraticaProgramacao> listaPraticas = new ArrayList<>();
	private int numPessoas;

	public Programacao(String linguagem, double horas, int numPessoas) {
		super(linguagem, horas);
		this.numPessoas = numPessoas;
	}

	public void addPratica(PraticaProgramacao pratica) {
		listaPraticas.add(pratica);
	}

	public void mostraPraticas() {
		for (PraticaProgramacao elemento : listaPraticas) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Programacao [numPessoas=" + numPessoas + "]";
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

}
