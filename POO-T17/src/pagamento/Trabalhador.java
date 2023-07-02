package pagamento;

public class Trabalhador {
	
	private String nome;
	private String sexo;
	private int idade;
	private Tarefa tarefa;
	
	public Trabalhador(String nome,String sexo,int idade,Tarefa tarefa) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.tarefa = tarefa;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", tarefa=" + tarefa + "]";
	}
	
	

}
