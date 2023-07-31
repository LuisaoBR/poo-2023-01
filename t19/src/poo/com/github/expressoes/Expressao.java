package poo.com.github.expressoes;

import java.util.ArrayList;
import java.util.List;

public class Expressao {
	List<Elemento> elementos = new ArrayList<>();

	public Expressao() {

	}

	public void addElemento(Elemento elemento) {
		elementos.add(elemento);
	}

	public void mostrarElementos() {
		for (int i = 0; i < elementos.size(); i++) {
			System.out.println(elementos.get(i).getDesc());
		}
	}

}
