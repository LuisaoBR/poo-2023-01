package Floresta;
import java.util.ArrayList;
import java.util.List;

public class Floresta {
	
	private Arvore arvore;
	private double extensao;
	private String tipo;
	List <Arvore> listaArvores = new ArrayList<>();
	
	Floresta(double extensao, String tipo){
		this.extensao = extensao;
		this.tipo = tipo;
	}
	
	public void addArvore(Arvore arvore) {
		listaArvores.add(arvore);
	}
	
	public void mostrarListaArvores() {
		for(Arvore elemento : listaArvores) {
			System.out.println(elemento);
		}
	}
	
	public void mostrarFloresta() {
		System.out.println("Extensao Territorial: "+this.extensao+" quilometros quadrados");
		System.out.println("Tipo de floresta: "+this.tipo);
	}

	public Arvore getArvore() {
		return arvore;
	}

	public void setArvore(Arvore arvore) {
		this.arvore = arvore;
	}

	public double getExtensao() {
		return extensao;
	}

	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
