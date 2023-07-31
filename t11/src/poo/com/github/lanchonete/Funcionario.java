package poo.com.github.lanchonete;

public class Funcionario {

	private String nome;
	private int numero;
	private double salario;
	private int qtdFuncionarios = 0;

	Funcionario(String nome, int numero, double salario) {
		this.nome = nome;
		this.numero = numero;
		this.salario = salario;
		this.qtdFuncionarios++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

}
