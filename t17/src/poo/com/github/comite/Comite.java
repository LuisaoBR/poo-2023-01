package poo.com.github.comite;

public class Comite {

	private int numPresidentes;
	private Pessoa presidente1;
	private Pessoa presidente2;
	private Pessoa presidente3;

	public Comite(int numPresidentes, Pessoa presidente1, Pessoa presidente2, Pessoa presidente3) {
		this.numPresidentes = numPresidentes;

		if (this.numPresidentes > 2) {
			this.presidente1 = presidente1;
			this.presidente2 = presidente2;
			this.presidente3 = presidente3;
		} else {
			this.presidente1 = presidente1;
			this.presidente2 = presidente2;
		}
	}

	public int getNumPresidentes() {
		return numPresidentes;
	}

	public void setNumPresidentes(int numPresidentes) {
		this.numPresidentes = numPresidentes;
	}

	public Pessoa getPresidente1() {
		return presidente1;
	}

	public void setPresidente1(Pessoa presidente1) {
		this.presidente1 = presidente1;
	}

	public Pessoa getPresidente2() {
		return presidente2;
	}

	public void setPresidente2(Pessoa presidente2) {
		this.presidente2 = presidente2;
	}

	public Pessoa getPresidente3() {
		return presidente3;
	}

	public void setPresidente3(Pessoa presidente3) {
		this.presidente3 = presidente3;
	}

	@Override
	public String toString() {
		return "Comite [numPresidentes=" + numPresidentes + ", presidente1=" + presidente1 + ", presidente2="
				+ presidente2 + ", presidente3=" + presidente3 + "]";
	}

}
