package poo.com.github.diretor;

public class Cargo {

	private String nome;
	private String sexo;
	private Pessoa pessoa;

	public Cargo(String nome, String sexo, Pessoa pessoa) {
		this.nome = nome;
		this.sexo = sexo;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Cargo [nome=" + nome + ", sexo=" + sexo + ", pessoa=" + pessoa + "]";
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
