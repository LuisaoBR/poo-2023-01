package poo.com.github.computador;

import java.util.ArrayList;
import java.util.List;

public class Casa extends Computador {
	List<Aluno> listaUsuarios = new ArrayList<>();

	public Casa(String marca, String modelo) {
		super(marca, modelo);
	}

	public void addAluno(Aluno aluno) {
		listaUsuarios.add(aluno);
	}

	public void mostraUsuarios() {
		for (Aluno elemento : listaUsuarios) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Casa [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

}
