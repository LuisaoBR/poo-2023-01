package poo.com.github.pagamento;

public class Hora extends Pagamento {

	private int horasTrabalhadas;
	private double valorHora;

	public Hora(int horasTrabalhadas, double valorHora) {

		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public double pagamento() {
		double pagamento = horasTrabalhadas * valorHora;
		super.setValor(pagamento);
		return pagamento;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "Hora [horasTrabalhadas=" + horasTrabalhadas + ", valorHora=" + valorHora + "]";
	}

}
