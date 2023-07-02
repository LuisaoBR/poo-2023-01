package pagamento;

public class Contrato extends Pagamento {
	
	private double valorContrato;
	
	public Contrato(double valorContrato) {
		
		this.valorContrato = valorContrato;
		super.setValor(valorContrato);
		
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	@Override
	public String toString() {
		return "Contrato [valorContrato=" + valorContrato + "]";
	}
	
	

}
