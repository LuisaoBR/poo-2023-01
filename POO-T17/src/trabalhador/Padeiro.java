package trabalhador;

public class Padeiro extends Trabalhador {

	
	private String padaria;
	private int anosDeExp;
	
	public Padeiro(String nome,String cpf,String carteiraDeTrabalho,String padaria,int anosDeExp) {
		super(nome,cpf,carteiraDeTrabalho);
		this.padaria = padaria;
		this.anosDeExp = anosDeExp;
	}

	public String getPadaria() {
		return padaria;
	}

	public void setPadaria(String padaria) {
		this.padaria = padaria;
	}

	public int getAnosDeExp() {
		return anosDeExp;
	}

	public void setAnosDeExp(int anosDeExp) {
		this.anosDeExp = anosDeExp;
	}

	@Override
	public String toString() {
		return "Padeiro [padaria=" + padaria + ", anosDeExp=" + anosDeExp + "]";
	}
	
	
}
