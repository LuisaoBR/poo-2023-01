package JanelaGrafica;
import java.util.ArrayList;
import java.util.List;

public class Menu extends ElementoInteracao {
	
	List<String> opcoes = new ArrayList<>();
	
	public Menu(double largura,double comprimento,double altura) {
		super(largura,comprimento,altura);
		
	}
	
	public void addOpcao(String op) {
		opcoes.add(op);
	}

}
