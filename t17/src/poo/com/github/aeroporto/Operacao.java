package poo.com.github.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Operacao {

	private String tipo;
	private String data;
	private String hora;
	List<Voo> listaVoos = new ArrayList<>();

	public Operacao(String tipo, String data, String hora) {
		this.tipo = tipo;
		this.data = data;
		this.hora = hora;
	}

	public void addVoo(Voo voo) {
		listaVoos.add(voo);
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", data=" + data + ", hora=" + hora + "]";
	}

	public void mostraVoos() {
		for (Voo elemento : listaVoos) {
			System.out.println(elemento);
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
