package poo.com.github.lanchonete;

public class Gerente extends Funcionario {

	private int crachaGerente;

	Gerente(String nome, int numero, double salario, int crachaGerente) {
		super(nome, numero, salario);
		this.crachaGerente = crachaGerente;
	}

	public int getCrachaGerente() {
		return crachaGerente;
	}

	public void setCrachaGerente(int crachaGerente) {
		this.crachaGerente = crachaGerente;
	}

}
