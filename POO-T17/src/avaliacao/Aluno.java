package avaliacao;

public class Aluno {
	
	private Prova prova;
	private String nome;
	private String sexo;
	private String matricula;
	
	public Aluno(Prova prova,String nome,String sexo,String matricula) {
		this.prova = prova;
		this.nome = nome;
		this.sexo = sexo;
		this.matricula = matricula;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [prova=" + prova + ", nome=" + nome + ", sexo=" + sexo + ", matricula=" + matricula + "]";
	}
	
	

}
