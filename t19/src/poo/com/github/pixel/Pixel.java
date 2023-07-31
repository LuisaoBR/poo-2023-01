package poo.com.github.pixel;

public class Pixel {

	private Ponto ponto;
	private Cor cor;
	private Imagem imagem;

	public Pixel(Imagem imagem, Ponto ponto, Cor cor) {
		this.imagem = imagem;
		this.ponto = ponto;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Pixel [ponto=" + ponto + ", cor=" + cor + ", imagem=" + imagem + "]";
	}

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

}
