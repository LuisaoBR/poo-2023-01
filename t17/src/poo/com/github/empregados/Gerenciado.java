package poo.com.github.empregados;

public class Gerenciado extends Funcionario {

	private String cracha;

	public Gerenciado(String nome, String sexo, String cpf, int idade, String cracha) {
		super(nome, sexo, cpf, idade);
		this.cracha = cracha;
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}

	@Override
	public String toString() {
		return "Gerenciado [cracha=" + cracha + "]";
	}

}
