package poo.com.github.pessoaheranca;

public class PessoaJuridica extends PessoaSuperClasse {

	private String nomeFantasia;
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
		super(nome, endereco);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
