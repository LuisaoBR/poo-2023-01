package PessoaEmpresa;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	List<Emprego> empregos = new ArrayList<>();
	List<PessoaEmpregado> empregados = new ArrayList<>();
	private String nome;
	private String cnpj;
	
	public Empresa(String nome,String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void addEmprego(Emprego emprego) {
		empregos.add(emprego);
	}
	
	public void addEmpregado(PessoaEmpregado empregado) {
		empregados.add(empregado);
	}
	
	public void mostraEmpregos() {
		for(Emprego elemento : empregos) {
			System.out.println(elemento);
		}
	}
	
	public void mostraEmpregados() {
		for(PessoaEmpregado elemento : empregados) {
			System.out.println(elemento);
		}
		
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + "]";
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
