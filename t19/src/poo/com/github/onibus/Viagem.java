package poo.com.github.onibus;

public class Viagem {
	private Onibus onibus;
	private Cidade origem;
	private Cidade destino;

	public Viagem(Onibus onibus, Cidade origem, Cidade destino) {
		this.onibus = onibus;
		this.origem = origem;
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Viagem [onibus=" + onibus + ", origem=" + origem + ", destino=" + destino + "]";
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Cidade getOrigem() {
		return origem;
	}

	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

}
