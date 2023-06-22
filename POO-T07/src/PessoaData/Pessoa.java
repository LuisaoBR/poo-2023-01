package PessoaData;

public class Pessoa {
	
	private Data nascimento;
	private String nome;
	private Pessoa pai;
	private Pessoa mae;
	
	public Pessoa(Data nascimento,String nome,Pessoa pai,Pessoa mae) {
		this.nascimento = nascimento;
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Data de Nascimento:");
		System.out.println(nascimento.getDia()+"/"+nascimento.getMes()+"/"+nascimento.getAno());
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	
	
	

}
