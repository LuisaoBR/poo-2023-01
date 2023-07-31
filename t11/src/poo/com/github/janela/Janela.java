package poo.com.github.janela;

public class Janela {

	private double area;
	private boolean temGrade;
	private boolean temTranca;
	private String cor;

	Janela(double area, boolean temGrade, boolean temTranca, String cor) {

		this.area = area;
		this.temGrade = temGrade;
		this.temTranca = temTranca;
		this.cor = cor;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isTemGrade() {
		return temGrade;
	}

	public void setTemGrade(boolean temGrade) {
		this.temGrade = temGrade;
	}

	public boolean isTemTranca() {
		return temTranca;
	}

	public void setTemTranca(boolean temTranca) {
		this.temTranca = temTranca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
