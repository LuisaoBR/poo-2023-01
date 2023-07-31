package poo.com.github.disco;

public class Permissao {

	private boolean isLeitura;
	private boolean isEscrita;
	private boolean isExecucao;

	public Permissao(boolean isLeitura, boolean isEscrita, boolean isExecucao) {
		this.isLeitura = isLeitura;
		this.isEscrita = isEscrita;
		this.isExecucao = isExecucao;
	}

	@Override
	public String toString() {
		return "Permissao [isLeitura=" + isLeitura + ", isEscrita=" + isEscrita + ", isExecucao=" + isExecucao + "]";
	}

	public boolean isLeitura() {
		return isLeitura;
	}

	public void setLeitura(boolean isLeitura) {
		this.isLeitura = isLeitura;
	}

	public boolean isEscrita() {
		return isEscrita;
	}

	public void setEscrita(boolean isEscrita) {
		this.isEscrita = isEscrita;
	}

	public boolean isExecucao() {
		return isExecucao;
	}

	public void setExecucao(boolean isExecucao) {
		this.isExecucao = isExecucao;
	}

}
