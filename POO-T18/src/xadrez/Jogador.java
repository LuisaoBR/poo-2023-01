package xadrez;

public class Jogador {
	
	private String nome;
	private String cor;
	
	public Jogador(String nome,String cor) {
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
		return "Jogador [nome=" + nome + ", cor=" + cor + "]";
	}
	
	
	
	

}
