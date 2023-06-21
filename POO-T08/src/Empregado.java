import java.util.ArrayList;
import java.util.List;

public class Empregado {
	
	public String nome;
	public String cpf;
	public String sexo;
	public int idade;
	List<Empregador> listaEmpresas = new ArrayList<>();
	
	public Empregado(String nome,String cpf,String sexo,int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public void addEmpregador(Empregador empregador) {
		listaEmpresas.add(empregador);
	}
	
	public void mostraEmpregador() {
		for(Empregador elemento : listaEmpresas) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
	
	

}
