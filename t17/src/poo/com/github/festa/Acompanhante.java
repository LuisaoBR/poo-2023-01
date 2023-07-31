package poo.com.github.festa;

public class Acompanhante extends Pessoa {

	private Convidado convidado;
	private Danca danca;

	public Acompanhante(Convidado convidado, Danca danca, String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		this.convidado = convidado;
		this.danca = danca;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	public Danca getDanca() {
		return danca;
	}

	public void setDanca(Danca danca) {
		this.danca = danca;
	}

	@Override
	public String toString() {
		return "Acompanhante [convidado=" + convidado + ", danca=" + danca + "]";
	}

}
