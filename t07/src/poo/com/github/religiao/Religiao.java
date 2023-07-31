package poo.com.github.religiao;

import java.util.ArrayList;
import java.util.List;

public class Religiao {

	private List<Devoto> devotos = new ArrayList<>();

	public Religiao() {

	}

	public void novoFiel(Devoto d) {
		devotos.add(d);
	}

	public List<Devoto> getDevotos() {
		return devotos;
	}

	public void setDevotos(List<Devoto> devotos) {
		this.devotos = devotos;
	}

}
