package poo.com.github.xadrez;

public class Lance {

	private Jogador jogador;
	private Peca peca;
	private Posicao posicao1;
	private Posicao posicao2;

	public Lance(Jogador jogador, Peca peca, Posicao posicao1, Posicao posicao2) {
		this.jogador = jogador;
		this.peca = peca;
		this.posicao1 = posicao1;
		this.posicao2 = posicao2;

	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Posicao getPosicao1() {
		return posicao1;
	}

	public void setPosicao1(Posicao posicao1) {
		this.posicao1 = posicao1;
	}

	public Posicao getPosicao2() {
		return posicao2;
	}

	public void setPosicao2(Posicao posicao2) {
		this.posicao2 = posicao2;
	}

	@Override
	public String toString() {
		return "Lance [jogador=" + jogador + ", peca=" + peca + ", posicao1=" + posicao1 + ", posicao2=" + posicao2
				+ "]";
	}

}
