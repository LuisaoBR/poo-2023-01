package poo.com.github.diretor;

public class Diretor extends Docente {

	public Diretor(String cracha, String nome, String sexo, Pessoa pessoa) {
		super(cracha, nome, sexo, pessoa);
	}

	@Override
	public String toString() {
		return "Diretor [getCracha()=" + getCracha() + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getPessoa()=" + getPessoa() + "]";
	}

}
