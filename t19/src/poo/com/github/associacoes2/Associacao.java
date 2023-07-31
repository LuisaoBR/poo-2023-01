package poo.com.github.associacoes2;

public class Associacao {

	private Classe classe;

	public Associacao(Classe classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Associacao [classe=" + classe + "]";
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}
