import java.util.ArrayList;
import java.util.List;

public class Armazem {
	
	public String nome;
	List <Pedido> listaPedidos = new ArrayList<>();
	public Viagem viagem;
	
	Armazem(){
		
	}
	
	public void addPedido(Pedido pedido) {
		listaPedidos.add(pedido);
		viagem.listaPedidos2.add(pedido);
	}

}
