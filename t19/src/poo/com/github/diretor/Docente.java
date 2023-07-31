package poo.com.github.diretor;

public class Docente extends Cargo {
	private String cracha;

	public Docente(String cracha, String nome, String sexo, Pessoa pessoa) {
		super(nome, sexo, pessoa);
		this.cracha = cracha;
	}

	@Override
	public String toString() {
		return "Docente [cracha=" + cracha + ", getNome()=" + getNome() + ", getSexo()=" + getSexo() + ", getPessoa()="
				+ getPessoa() + "]";
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}

}
