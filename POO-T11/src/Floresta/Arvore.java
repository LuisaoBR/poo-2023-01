package Floresta;
import java.util.ArrayList;
import java.util.List;

public class Arvore {
	
	private Floresta floresta;
	private double altura;
	private double diametro;
	List <Floresta> listaFlorestas = new ArrayList<>();
	
	Arvore(double altura, double diametro){
		this.altura = altura;
		this.diametro = diametro;
	}
	
	public void addFloresta(Floresta floresta) {
		listaFlorestas.add(floresta);
	}
	
	public void mostrarListaFlorestas() {
		for(Floresta elemento : listaFlorestas) {
			System.out.println(elemento);
		}
	}
	
	public void mostrarArvore() {
		System.out.println("Altura: "+this.altura+" metros");
		System.out.println("Diametro: "+this.diametro+" metros");
	}

	public Floresta getFloresta() {
		return floresta;
	}

	public void setFloresta(Floresta floresta) {
		this.floresta = floresta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	

}
