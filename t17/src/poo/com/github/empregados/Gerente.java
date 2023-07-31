package poo.com.github.empregados;

public class Gerente extends Funcionario {

	private String carteiraDeGerente;

	public Gerente(String nome, String sexo, String cpf, int idade, String carteiraDeGerente) {
		super(nome, sexo, cpf, idade);
		this.carteiraDeGerente = carteiraDeGerente;
	}

	public String getCarteiraDeGerente() {
		return carteiraDeGerente;
	}

	public void setCarteiraDeGerente(String carteiraDeGerente) {
		this.carteiraDeGerente = carteiraDeGerente;
	}

	@Override
	public String toString() {
		return "Gerente [carteiraDeGerente=" + carteiraDeGerente + "]";
	}

}
