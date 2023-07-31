package poo.com.github.agencia;

public class Cliente {
	private String nome;
	private String sexo;
	private String cpf;
	private int num;

	public Cliente(String nome, String sexo, String cpf, int num) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", num=" + num + "]";
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
