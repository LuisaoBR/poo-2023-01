package poo.com.github.circulo;

public class Circulo {

	public double raio;
	public PontoDoCirculo centro;

	Circulo() {

	}

	public void transladar(double x, double y) {

		centro.transladar(x, y);
	}

}
