package Periodo;

public class Periodo {
	
	private Data data;
	
	Periodo(){
		
	}
	
	public void mostraData(Data dt) {
		if(dt.isEhFinal() == true) {
			System.out.println("DATA FINAL:");
			System.out.println(dt.getDia()+"/"+dt.getMes()+"/"+dt.getAno());
		}
		else {
			System.out.println("DATA INICIAL:");
			System.out.println(dt.getDia()+"/"+dt.getMes()+"/"+dt.getAno());
		}
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	

}
