package xadrez;

public class Peca {
	
	private String nome;
	private String cor;
	
	public Peca(String nome,String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Peca [nome=" + nome + ", cor=" + cor + "]";
	}
	
	

}
