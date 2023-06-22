package Arquivo;
public class Usuario {
	
	private String nome;
	private String matricula;
	private int idade;
	private Grupo grupo;
	
	public Usuario(String nome,String matricula,int idade,Grupo grupo) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", grupo=" + grupo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	

}
