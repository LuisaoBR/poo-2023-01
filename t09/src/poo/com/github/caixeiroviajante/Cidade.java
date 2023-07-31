package poo.com.github.caixeiroviajante;

import java.util.ArrayList;
import java.util.List;

public class Cidade {

	public String nome;
	public double populacao;
	public String estado;
	List<Armazem> listaArmazens = new ArrayList<>();

	Cidade() {

	}

	public void addArmazem(Armazem armazem) {
		listaArmazens.add(armazem);
	}

}
