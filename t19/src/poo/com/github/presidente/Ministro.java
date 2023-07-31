package poo.com.github.presidente;

import java.util.ArrayList;
import java.util.List;

public class Ministro {

	private String nome;
	private String dataNomeacao;
	private Presidente presidente;
	List<Assessor> assessores = new ArrayList<>();

	public Ministro(String nome, String dataNomeacao, Presidente presidente) {
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.presidente = presidente;
	}

	public void nomearAssessor(Assessor assessor) {
		assessores.add(assessor);
	}

	public void mostrarAssessores() {
		for (Assessor elemento : assessores) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Ministro [nome=" + nome + ", dataNomeacao=" + dataNomeacao + ", presidente=" + presidente + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNomeacao() {
		return dataNomeacao;
	}

	public void setDataNomeacao(String dataNomeacao) {
		this.dataNomeacao = dataNomeacao;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

}
