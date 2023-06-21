import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private Endereco endereco;
	private String telefone;
	List <Transacao> listaTransacoes = new ArrayList<>();
	
	Cliente(){
		
	}
	
	public void addTransacao(Transacao transacao) {
		listaTransacoes.add(transacao);
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
