package poo.com.github.diretor;

public class ViceDiretor extends Docente {

	public ViceDiretor(String cracha, String nome, String sexo, Pessoa pessoa) {
		super(cracha, nome, sexo, pessoa);
	}

	@Override
	public String toString() {
		return "ViceDiretor [getCracha()=" + getCracha() + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getPessoa()=" + getPessoa() + "]";
	}

}
