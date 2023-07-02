package lanchonete;

public class Item {
	
	private Bebida bebida;
	private Sanduiche sanduiche;
	private Pedido pedido;
	private Detalhe detalhe;
	
	public Item(Pedido pedido,Detalhe detalhe) {
		this.pedido = pedido;
		this.detalhe = detalhe;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Detalhe getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(Detalhe detalhe) {
		this.detalhe = detalhe;
	}

	@Override
	public String toString() {
		return "Item [bebida=" + bebida + ", sanduiche=" + sanduiche + ", pedido=" + pedido + ", detalhe=" + detalhe
				+ "]";
	}
	
	

}
