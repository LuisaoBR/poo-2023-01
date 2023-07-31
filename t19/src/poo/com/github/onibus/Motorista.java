package poo.com.github.onibus;

public class Motorista extends Papel {
	private String cnh;

	public Motorista(String nome, String cpf, String cnh) {
		super(nome, cpf);
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Motorista [cnh=" + cnh + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

}
