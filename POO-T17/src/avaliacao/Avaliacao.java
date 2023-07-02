package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
	
	List <Questao> questoes = new ArrayList<>();
	List <Prova> provas = new ArrayList<>();
	private String data;
	private String finalidade;
	
	public Avaliacao(String data,String finalidade) {
		this.data = data;
		this.finalidade = finalidade;
	}
	
	public void addQuestao(Questao questao) {
		questoes.add(questao);
	}
	
	public void mostraQuestoes() {
		for(Questao elemento : questoes) {
			System.out.println(elemento);
		}
	}
	
	public void addProva(Prova prova) {
		provas.add(prova);
	}
	
	public void mostraProvas() {
		for(Prova elemento : provas) {
			System.out.println(elemento);
		}
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	@Override
	public String toString() {
		return "Avaliacao [data=" + data + ", finalidade=" + finalidade + "]";
	}
	
	

}
