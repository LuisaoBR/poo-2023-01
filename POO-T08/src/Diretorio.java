import java.util.ArrayList;
import java.util.List;

public class Diretorio {
	
	private String nome;
	private int numero;
	List<UserDiretorio> usuariosAutorizados = new ArrayList<>();
	
	public Diretorio(String nome,int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public void addUsuarioAutorizado(UserDiretorio user) {
		usuariosAutorizados.add(user);
	}
	
	public void mostraUsuarios() {
		System.out.println("USUARIOS AUTORIZADOS:");
		for(UserDiretorio elemento : usuariosAutorizados) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Diretorio [nome=" + nome + ", numero=" + numero + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
