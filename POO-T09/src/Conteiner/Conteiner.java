package Conteiner;
import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento {
	
	public String descricao;
	List <Elemento> elementos = new ArrayList<>();
	
	
	Conteiner(){
		super();
	}
	
	public void addElementos(Elemento elemento) {
		elementos.add(elemento);
	}

}
