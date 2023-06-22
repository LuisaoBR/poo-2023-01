package Texto;
import java.util.ArrayList;
import java.util.List;

public class Texto {
	
	List<Paragrafo> listaParagrafos = new ArrayList<>();
	
	public Texto() {
		
	}
	
	public void addParagrafo(Paragrafo paragrafo) {
		listaParagrafos.add(paragrafo);
	}
	
	public void mostraTexto() {
		for(Paragrafo elemento : listaParagrafos) {
			System.out.println(elemento);
		}
	}
	

}
