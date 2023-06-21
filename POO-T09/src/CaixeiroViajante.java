import java.util.ArrayList;
import java.util.List;

public class CaixeiroViajante {
	
	public String nome;
	public String sexo;
	public int idade;
	List <Viagem> listaViagens = new ArrayList<>();
	
	CaixeiroViajante(){
		
	}
	
	public void addViagem(Viagem viagem) {
		listaViagens.add(viagem);
	}

}
