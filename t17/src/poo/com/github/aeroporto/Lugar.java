package poo.com.github.aeroporto;

public class Lugar {

	private Aviao aviao;
	private String posicao;
	private String tipo;
	private Passageiro passageiro;

	public Lugar(Aviao aviao, String posicao, String tipo) {
		this.aviao = aviao;
		this.posicao = posicao;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Lugar [aviao=" + aviao + ", posicao=" + posicao + ", tipo=" + tipo + ", passageiro=" + passageiro + "]";
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

}
