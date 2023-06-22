package PessoaHabitos;
import java.util.ArrayList;
import java.util.List;

public class PessoaComHabito {
	
	private String nome;
	private int idade;
	private Habito habito;
	List <Habito> habitos = new ArrayList<>();
	
	PessoaComHabito(){
		
	}
	
	public void adicionarHabito(Habito habito) {
		
		habitos.add(habito);
	}
	

	public Habito getHabito() {
		return habito;
	}

	public void setHabito(Habito habito) {
		this.habito = habito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
