package poo.com.github.presidente;

import java.util.ArrayList;
import java.util.List;

public class Presidente {

	private String nome;
	private String cpf;
	List<Ministro> ministros = new ArrayList<>();

	public Presidente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void nomearMinistro(Ministro ministro) {
		ministros.add(ministro);
	}

	public void mostrarMinistros() {
		for (Ministro elemento : ministros) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Presidente [nome=" + nome + ", cpf=" + cpf + "]";
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

}
