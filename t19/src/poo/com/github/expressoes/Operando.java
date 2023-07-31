package poo.com.github.expressoes;

public class Operando extends Elemento {

	public Operando(String desc) {
		super(desc);
	}

	@Override
	public String toString() {
		return "Operando [getDesc()=" + getDesc() + "]";
	}

}
