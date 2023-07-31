package poo.com.github.projetodesoftware;

import java.util.ArrayList;
import java.util.List;

public class ProjetoSoftware {

	private LinguagemProgramacao linguagem;
	private String nome;
	List<LinguagemProgramacao> listaLinguagens = new ArrayList<>();

	ProjetoSoftware(String nome) {
		this.nome = nome;
	}

	public LinguagemProgramacao getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(LinguagemProgramacao linguagem) {
		this.linguagem = linguagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
