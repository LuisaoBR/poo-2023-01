package poo.com.github.trabalhador;

public class Acougueiro extends Trabalhador {

	private String acougue;
	private int anosDeExp;

	public Acougueiro(String nome, String cpf, String carteiraDeTrabalho, String acougue, int anosDeExp) {
		super(nome, cpf, carteiraDeTrabalho);
		this.acougue = acougue;
		this.anosDeExp = anosDeExp;
	}

	public String getAcougue() {
		return acougue;
	}

	public void setAcougue(String acougue) {
		this.acougue = acougue;
	}

	public int getAnosDeExp() {
		return anosDeExp;
	}

	public void setAnosDeExp(int anosDeExp) {
		this.anosDeExp = anosDeExp;
	}

	@Override
	public String toString() {
		return "Acougueiro [acougue=" + acougue + ", anosDeExp=" + anosDeExp + "]";
	}

}
