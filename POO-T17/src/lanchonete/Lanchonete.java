package lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
	
	private String nomeFantasia;
	private String cnpj;
	private String endereco;
	List <Sanduiche> listaSanduiches = new ArrayList<>();
	
	public Lanchonete(String nomeFantasia,String cnpj,String endereco) {
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public void serveSanduiche(Sanduiche sanduiche) {
		listaSanduiches.add(sanduiche);
	}
	
	public void mostraSanduiches() {
		for(Sanduiche elemento : listaSanduiches) {
			System.out.println(elemento);
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Lanchonete [nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}
	
	

}
