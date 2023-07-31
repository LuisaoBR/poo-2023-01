package poo.com.github.presidente;

public class Assessor {

	private String nome;
	private String dataNomeacao;
	private Ministro ministro;

	public Assessor(String nome, String dataNomeacao, Ministro ministro) {
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.ministro = ministro;
	}

	@Override
	public String toString() {
		return "Assessor [nome=" + nome + ", dataNomeacao=" + dataNomeacao + ", ministro=" + ministro + "]";
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

	public Ministro getMinistro() {
		return ministro;
	}

	public void setMinistro(Ministro ministro) {
		this.ministro = ministro;
	}

}
