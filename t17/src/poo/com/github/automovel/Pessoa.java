package poo.com.github.automovel;

public class Pessoa {

	private String nome;
	private String sexo;
	private int idade;
	private Automovel automovel;

	public Pessoa(String nome, String sexo, int idade, Automovel automovel) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.automovel = automovel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", automovel=" + automovel + "]";
	}

}
