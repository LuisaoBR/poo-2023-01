package poo.com.github.herancaagregacao;

import java.util.ArrayList;
import java.util.List;

public class Moradia {

	private String cep;
	private String endereco;
	private int qtmoradores;
	List<Casa> listaCasas = new ArrayList<>();

	public Moradia(String cep, String endereco, int qtmoradores) {
		this.cep = cep;
		this.endereco = endereco;
		this.qtmoradores = qtmoradores;
	}

	public void addCasa(Casa casa) {
		listaCasas.add(casa);
	}

	public void mostraCasas() {
		for (Casa elemento : listaCasas) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Moradia [cep=" + cep + ", endereco=" + endereco + ", qtmoradores=" + qtmoradores + "]";
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQtmoradores() {
		return qtmoradores;
	}

	public void setQtmoradores(int qtmoradores) {
		this.qtmoradores = qtmoradores;
	}

}
