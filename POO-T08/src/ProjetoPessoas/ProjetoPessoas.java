package ProjetoPessoas;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPessoas {
	
	private String nome;
	private String descricao;
	private int qtPessoas;
	List<PessoaProjeto> listaPessoas = new ArrayList <>();
	
	public ProjetoPessoas(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.qtPessoas = 0;
	}
	
	public void addPessoas(PessoaProjeto pessoa) {
		listaPessoas.add(pessoa);
		this.qtPessoas++;
	}
	
	public void mostraPessoas() {
		System.out.println("Quantidade de pessoas no projeto: "+this.qtPessoas);
		
		for(PessoaProjeto elemento : listaPessoas) {
			System.out.println(elemento);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtPessoas() {
		return qtPessoas;
	}

	public void setQtPessoas(int qtPessoas) {
		this.qtPessoas = qtPessoas;
	}
	
	

}
