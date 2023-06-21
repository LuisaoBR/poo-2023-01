import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	
	private int numero;
	List<Permissao> listaPermissoes = new ArrayList<>();
	
	public Arquivo(int numero) {
		this.numero = numero;
	}
	
	public void addPermissao(Permissao permissao) {
		listaPermissoes.add(permissao);
	}
	
	public void mostraPermissoes() {
		for(Permissao elemento : listaPermissoes) {
			System.out.println(elemento);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
