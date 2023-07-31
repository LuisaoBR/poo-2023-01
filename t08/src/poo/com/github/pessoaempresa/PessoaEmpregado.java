package poo.com.github.pessoaempresa;

import java.util.ArrayList;
import java.util.List;

public class PessoaEmpregado {

	List<Emprego> listaEmpregos = new ArrayList<>();
	private String nome;
	private String cpf;
	private String sexo;
	private int idade;

	public PessoaEmpregado(String nome, String cpf, String sexo, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
	}

	public void addEmprego(Emprego emprego) {
		listaEmpregos.add(emprego);
	}

	public void mostraEmprego() {
		for (Emprego elemento : listaEmpregos) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "PessoaEmpregado [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", idade=" + idade + "]";
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

}
