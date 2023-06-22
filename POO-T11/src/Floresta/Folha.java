package Floresta;

public class Folha {
	
	private TipoFolha tipofolha;
	private String cor;
	private double tamanho;
	
	Folha(TipoFolha tipofolha, String cor, double tamanho){
		this.tipofolha = tipofolha;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public void mostrarFolha() {
		System.out.println("Tipo da Folha: "+this.tipofolha.getTipo());
		System.out.println("Cor: "+this.cor);
		System.out.println("Tamanho: "+this.tamanho+" cm");
	}

	public TipoFolha getTipofolha() {
		return tipofolha;
	}

	public void setTipofolha(TipoFolha tipofolha) {
		this.tipofolha = tipofolha;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
