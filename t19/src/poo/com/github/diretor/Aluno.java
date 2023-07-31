package poo.com.github.diretor;

public class Aluno extends Cargo {

	private String matricula;

	public Aluno(String nome, String sexo, Pessoa pessoa, String matricula) {
		super(nome, sexo, pessoa);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", getNome()=" + getNome() + ", getSexo()=" + getSexo() + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
