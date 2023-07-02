package pagamento;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
	
	private String descricao;
	List <Pagamento> pagamentos = new ArrayList<>();
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public void recebePagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public void mostraPagamentos() {
		for(Pagamento elemento : pagamentos) {
			System.out.println(elemento);
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}
	
	

}
