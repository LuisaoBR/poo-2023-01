
import java.util.ArrayList;
import java.util.List;

import poo.com.github.pessoadata.Pessoa;

public class Uniao {

	private List<Pessoa> filhos = new ArrayList<>();
	private Pessoa[] parceiros = new Pessoa[2];

	public void novoFilho(Pessoa p) {
		filhos.add(p);
	}

	public Uniao(Pessoa a, Pessoa b) {
		this.parceiros[0] = a;
		this.parceiros[1] = b;
	}

}
