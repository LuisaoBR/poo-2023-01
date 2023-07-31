package poo.com.github.revisao;

public class Versao {
	private Software software;
	private String numVersao;

	public Versao(String numVersao) {
		this.numVersao = numVersao;
	}

	@Override
	public String toString() {
		return "Versao [software=" + software + ", numVersao=" + numVersao + "]";
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public String getNumVersao() {
		return numVersao;
	}

	public void setNumVersao(String numVersao) {
		this.numVersao = numVersao;
	}

}
