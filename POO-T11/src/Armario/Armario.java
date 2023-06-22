package Armario;

public class Armario {
	
	private Prateleira prateleira;
	private double altura;
	private double comprimento;
	private double largura;
	
	Armario(double altura,double comprimento, double largura){
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public Prateleira getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(Prateleira prateleira) {
		this.prateleira = prateleira;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	

}
