package poo.com.github.arquivo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private int numero;
	List<Usuario> listaUsuarios = new ArrayList<>();
	List<Permissao> permissoes = new ArrayList<>();

	public Grupo(int numero) {
		this.numero = numero;
	}

	public void addUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}

	public void addPermissao(Permissao permissao) {
		permissoes.add(permissao);
	}

	public void mostraUsuarios() {
		for (Usuario elemento : listaUsuarios) {
			System.out.println(elemento);
		}
	}

	public void mostraPermissoes() {
		for (Permissao elemento : permissoes) {
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
