import java.util.ArrayList;
import java.util.List;

public class Oficina {
	
	private String nome;
	private Endereco endereco;
	private String telefone;
	List <Bicicleta> bicicletasDisponiveis = new ArrayList<>();
	
	Oficina(){
		
	}
	
	public void addBicicleta(Bicicleta bicicleta) {
		bicicletasDisponiveis.add(bicicleta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
