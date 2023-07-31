package poo.com.github.expressoes;

public class Elemento {
	private String desc;

	public Elemento(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Elemento [desc=" + desc + "]";
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
