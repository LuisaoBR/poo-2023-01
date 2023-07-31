package poo.com.github.computador;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String matricula;
	private UfgPc ufgpc;
	List<Casa> listaPcsCasa = new ArrayList<>();

	public Aluno(String nome, String matricula, UfgPc ufgpc) {
		this.nome = nome;
		this.matricula = matricula;
		this.ufgpc = ufgpc;
	}

	public void addPcCasa(Casa PcCasa) {
		listaPcsCasa.add(PcCasa);
	}

	public void mostraPcCasa() {
		for (Casa elemento : listaPcsCasa) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", ufgpc=" + ufgpc + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public UfgPc getUfgpc() {
		return ufgpc;
	}

	public void setUfgpc(UfgPc ufgpc) {
		this.ufgpc = ufgpc;
	}

}
