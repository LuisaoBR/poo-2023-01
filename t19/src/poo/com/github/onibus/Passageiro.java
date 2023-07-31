package poo.com.github.onibus;

public class Passageiro extends Papel {
	private String sexo;

	public Passageiro(String nome, String cpf, String sexo) {
		super(nome, cpf);
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Passageiro [sexo=" + sexo + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
