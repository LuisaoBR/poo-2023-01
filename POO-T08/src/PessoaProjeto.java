import java.util.ArrayList;
import java.util.List;

public class PessoaProjeto {
	
	private String nome;
	private String cpf;
	private String sexo;
	private int idade;
	List<ProjetoPessoas> listaProjetos = new ArrayList<>();
	
	public PessoaProjeto(String nome,String cpf,String sexo,int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public void addProjeto(ProjetoPessoas projeto) {
		listaProjetos.add(projeto);
	}
	
	public void mostraProjetos() {
		for(ProjetoPessoas elemento : listaProjetos) {
			System.out.println(elemento);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	

}
