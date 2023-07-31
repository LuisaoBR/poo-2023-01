package poo.com.github.computador;

public class CPU extends Dispositivo {

	private double velocidade;
	private int numNucleos;
	private Memoria memoria;
	private PlacaMae placamae;

	public CPU(String numSerie, String fabricante, double velocidade, int numNucleos) {
		super(numSerie, fabricante);
		this.velocidade = velocidade;
		this.numNucleos = numNucleos;
	}

	@Override
	public String toString() {
		return "CPU [velocidade=" + velocidade + ", numNucleos=" + numNucleos + ", memoria=" + memoria + ", placamae="
				+ placamae + "]";
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getNumNucleos() {
		return numNucleos;
	}

	public void setNumNucleos(int numNucleos) {
		this.numNucleos = numNucleos;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public PlacaMae getPlacamae() {
		return placamae;
	}

	public void setPlacamae(PlacaMae placamae) {
		this.placamae = placamae;
	}

}
