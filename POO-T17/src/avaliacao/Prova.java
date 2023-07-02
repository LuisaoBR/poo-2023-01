package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Prova {
	
	List <Resposta> respostas = new ArrayList<>();
	private Aluno aluno;
	private Avaliacao avaliacao;
	
	public Prova(Aluno aluno,Avaliacao avaliacao) {
		this.aluno = aluno;
		this.avaliacao = avaliacao;
	}
	
	public void addResposta(Resposta resposta) {
		respostas.add(resposta);
	}
	
	public void mostraRespostas() {
		for(Resposta elemento : respostas) {
			System.out.println(elemento);
		}
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Prova [aluno=" + aluno + ", avaliacao=" + avaliacao + "]";
	}
	
	

}
