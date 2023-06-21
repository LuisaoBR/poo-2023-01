
public class JanelaComVidro extends Janela {
	
	private double areaVidro;
	
	JanelaComVidro(double areaVidro, double area, boolean temGrade, boolean temTranca, String cor){
		
		super(area,temGrade,temTranca,cor);
		this.areaVidro = areaVidro;
	}
	
	public void calculaArea() {
		super.setArea(areaVidro+super.getArea());
	}

	public double getAreaVidro() {
		return areaVidro;
	}

	public void setAreaVidro(double areaVidro) {
		this.areaVidro = areaVidro;
	}
	
	

}
