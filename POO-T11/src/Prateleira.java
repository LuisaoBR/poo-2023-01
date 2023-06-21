
public class Prateleira {
	
	private Compartimento compartimento;
	private double tamanho;
	
	Prateleira(double tamanho){
		this.tamanho = tamanho;
	}

	public Compartimento getCompartimento() {
		return compartimento;
	}

	public void setCompartimento(Compartimento compartimento) {
		this.compartimento = compartimento;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
