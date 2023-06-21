
public class Escola {
	
	private Endereco endereco;
	private String nome;
	private int capacidadeAlunos;
	private String cnpj;
	
	public Escola(Endereco endereco, String nome, int capacidadeAlunos, String cnpj) {
		this.endereco = endereco;
		this.nome = nome;
		this.capacidadeAlunos = capacidadeAlunos;
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidadeAlunos() {
		return capacidadeAlunos;
	}

	public void setCapacidadeAlunos(int capacidadeAlunos) {
		this.capacidadeAlunos = capacidadeAlunos;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
