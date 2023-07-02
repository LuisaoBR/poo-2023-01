package aeroporto;

public class CoPiloto {
	
	private String nome;
	private int idade;
	private String sexo;
	private int anosExperiencia;
	
	public CoPiloto(String nome,int idade,String sexo,int anosExperiencia) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.anosExperiencia = anosExperiencia;
	}

	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", anosExperiencia=" + anosExperiencia
				+ "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	

}
