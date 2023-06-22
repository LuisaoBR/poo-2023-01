package CaixeiroViajante;
import java.util.ArrayList;
import java.util.List;

public class Viagem {
	
	public int codigo;
	List <Cidade> listaCidades = new ArrayList<>();
	List <Pedido> listaPedidos2 = new ArrayList<>();
	
	Viagem(){
		
	}
	
	public void addCidade(Cidade cidade) {
		listaCidades.add(cidade);
	}

}
