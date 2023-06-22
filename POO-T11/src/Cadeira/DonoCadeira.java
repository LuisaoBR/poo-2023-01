package Cadeira;
import java.util.ArrayList;
import java.util.List;

public class DonoCadeira {
	
	private String nome;
	private String cpf;
	private char sexo;
	private Cadeira cadeira;
	List <Cadeira> listaCadeiras = new ArrayList<>();
	
	DonoCadeira(){
		
	}
	
	public void addCadeira(Cadeira cadeira) {
		listaCadeiras.add(cadeira);
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Cadeira getCadeira() {
		return cadeira;
	}

	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}
	
	

}
