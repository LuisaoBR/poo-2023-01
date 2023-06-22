package Circulo;

public class PontoDoCirculo {
	
	public double x;
	public double y;
	
	PontoDoCirculo(){
		
	}
	
	public void transladar(double dx, double dy) {
		
		this.x = x + dx;
		this.y = y + dy;
	}

}
