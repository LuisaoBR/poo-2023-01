package poo.com.github.notafiscal;

public class Produto {

	private Item item;
	private String descricao;

	public Produto(Item item, String descricao) {
		this.item = item;
		this.descricao = descricao;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [item=" + item + ", descricao=" + descricao + "]";
	}

}
