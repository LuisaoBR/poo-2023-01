package poo.com.github.lanchonete;

public class Detalhe {

	private String descricao;
	private String acompanhamento;

	public Detalhe(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	@Override
	public String toString() {
		return "Detalhe [descricao=" + descricao + ", acompanhamento=" + acompanhamento + "]";
	}

}
