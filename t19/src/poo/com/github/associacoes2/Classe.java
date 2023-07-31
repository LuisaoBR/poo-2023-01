package poo.com.github.associacoes2;

public class Classe {

	private Associacao associacao;

	public Classe(Associacao associacao) {
		this.associacao = associacao;
	}

	@Override
	public String toString() {
		return "Classe [associacao=" + associacao + "]";
	}

	public Associacao getAssociacao() {
		return associacao;
	}

	public void setAssociacao(Associacao associacao) {
		this.associacao = associacao;
	}

}
