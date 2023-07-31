package poo.com.github.revisao;

public class Software {
	private String nome;

	public Software(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Software [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
