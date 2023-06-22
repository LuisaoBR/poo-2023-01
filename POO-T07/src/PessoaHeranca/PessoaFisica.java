package PessoaHeranca;
public class PessoaFisica extends PessoaSuperClasse {
	
	private String corPele;
	private String cpf;
	
	public PessoaFisica(String nome,String endereco,String corPele,String cpf) {
		super(nome,endereco);
		
		this.corPele = corPele;
		this.cpf = cpf;
	}

	public String getCorPele() {
		return corPele;
	}

	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
