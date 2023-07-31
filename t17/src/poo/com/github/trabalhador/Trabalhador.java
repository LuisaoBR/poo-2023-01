package poo.com.github.trabalhador;

public class Trabalhador {

	private String nome;
	private String cpf;
	private String carteiraDeTrabalho;

	public Trabalhador(String nome, String cpf, String carteiraDeTrabalho) {
		this.nome = nome;
		this.cpf = cpf;
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", cpf=" + cpf + ", carteiraDeTrabalho=" + carteiraDeTrabalho + "]";
	}

}
