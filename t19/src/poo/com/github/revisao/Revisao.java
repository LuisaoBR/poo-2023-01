package poo.com.github.revisao;

public class Revisao {
	private Versao versao;
	private String numRevisao;

	public Revisao(Versao versao, String numRevisao) {
		this.versao = versao;
		this.numRevisao = numRevisao;
	}

	public Versao getVersao() {
		return versao;
	}

	public void setVersao(Versao versao) {
		this.versao = versao;
	}

	public String getNumRevisao() {
		return numRevisao;
	}

	public void setNumRevisao(String numRevisao) {
		this.numRevisao = numRevisao;
	}

	@Override
	public String toString() {
		return "Revisao [versao=" + versao + ", numRevisao=" + numRevisao + "]";
	}

}
