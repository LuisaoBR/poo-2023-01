package poo.com.github.comite;

public class Pessoa {

	private String nome;
	private String sexo;
	private int idade;
	private boolean isMembroDoComite;
	private Comite comite;

	public Pessoa(String nome, String sexo, boolean isMembroDoComite) {
		this.nome = nome;
		this.sexo = sexo;
		this.isMembroDoComite = isMembroDoComite;
	}

	public void addComite(Comite com) {
		if (this.isMembroDoComite == true) {
			this.comite = com;
		}
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

	public boolean isMembroDoComite() {
		return isMembroDoComite;
	}

	public void setMembroDoComite(boolean isMembroDoComite) {
		this.isMembroDoComite = isMembroDoComite;
	}

	public Comite getComite() {
		return comite;
	}

	public void setComite(Comite comite) {
		this.comite = comite;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", isMembroDoComite=" + isMembroDoComite
				+ ", comite=" + comite + "]";
	}

}
