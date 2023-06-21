
public class Lanchonete {
	
	private Funcionario funcionario;
	private Gerente gerente;
	private String nome;
	private String cnpj;
	
	Lanchonete(String nome,String cnpj){
		if(funcionario.getQtdFuncionarios() > 1) {
			this.nome = nome;
			this.cnpj = cnpj;
		}
		else {
			System.out.println("Nao foi possivel cadastrar a Lanchonete!");
		}
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
