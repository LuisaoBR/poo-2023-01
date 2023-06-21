import java.util.ArrayList;
import java.util.List;

public class Empregador {
	
	private String nome;
	private String cnpj;
	List<Empregado> listaEmpregados = new ArrayList<>();
	
	public Empregador(String nome,String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void addEmpregado(Empregado empregado) {
		listaEmpregados.add(empregado);
	}
	
	public void mostraEmpregados() {
		for(Empregado elemento : listaEmpregados) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Empregador [nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	

}
