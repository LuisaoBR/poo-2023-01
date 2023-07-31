package poo.com.github.festa;

import java.util.ArrayList;
import java.util.List;

public class Festa {

	private String endereco;
	private String horario;
	private String data;
	List<Convite> listaConvites = new ArrayList<>();

	public Festa(String endereco, String horario, String data) {
		this.endereco = endereco;
		this.horario = horario;
		this.data = data;
	}

	public void addConvite(Convite convite) {
		listaConvites.add(convite);
	}

	public void mostraConvites() {
		for (Convite elemento : listaConvites) {
			System.out.println(elemento);
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Festa [endereco=" + endereco + ", horario=" + horario + ", data=" + data + "]";
	}

}
