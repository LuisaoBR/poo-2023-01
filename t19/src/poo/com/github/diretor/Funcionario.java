package poo.com.github.diretor;

public class Funcionario extends Cargo {

	private String id;

	public Funcionario(String nome, String sexo, Pessoa pessoa, String id) {
		super(nome, sexo, pessoa);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", getNome()=" + getNome() + ", getSexo()=" + getSexo() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
