package poo.com.github.janelagrafica;

public class Botao extends ElementoInteracao {

	private String paginaAtual;
	private String paginaDestino;

	public Botao(double largura, double comprimento, double altura, String paginaAtual, String paginaDestino) {
		super(largura, comprimento, altura);
		this.paginaAtual = paginaAtual;
		this.paginaDestino = paginaDestino;
	}

	public String getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public String getPaginaDestino() {
		return paginaDestino;
	}

	public void setPaginaDestino(String paginaDestino) {
		this.paginaDestino = paginaDestino;
	}

}
