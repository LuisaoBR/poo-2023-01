package poo.com.github.janelagrafica;

public class BarraRolagem extends ElementoInteracao {

	private double x;
	private double y;

	public BarraRolagem(double largura, double comprimento, double altura, double x, double y) {
		super(largura, comprimento, altura);
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
