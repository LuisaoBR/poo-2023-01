package poo.com.github.diretor;

public class Pessoa {

	private Cargo cargo;

	public Pessoa(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Pessoa [cargo=" + cargo + "]";
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
