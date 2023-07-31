package poo.com.github.agencia;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	List<Cliente> clientes = new ArrayList<>();

	public Fila() {
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void mostrarFila() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).getNome());
			System.out.println(clientes.get(i).getNum());
			System.out.println(clientes.get(i).getCpf());
			System.out.println(clientes.get(i).getSexo());
		}
	}

}
