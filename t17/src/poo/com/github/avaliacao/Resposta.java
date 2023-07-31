package poo.com.github.avaliacao;

public class Resposta {

	private String conteudoResposta;

	public Resposta(String conteudoResposta) {
		this.conteudoResposta = conteudoResposta;
	}

	public String getConteudoResposta() {
		return conteudoResposta;
	}

	public void setConteudoResposta(String conteudoResposta) {
		this.conteudoResposta = conteudoResposta;
	}

	@Override
	public String toString() {
		return "Resposta [conteudoResposta=" + conteudoResposta + "]";
	}

}
