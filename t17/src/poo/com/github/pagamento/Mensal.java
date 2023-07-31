package poo.com.github.pagamento;

public class Mensal extends Pagamento {

	private double salario;

	public Mensal(double salario) {
		this.salario = salario;
		super.setValor(salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Mensal [salario=" + salario + "]";
	}

}
