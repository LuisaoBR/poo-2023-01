package Texto;

public class Paragrafo {
	
	private Sentenca sentenca;
	private String paragrafo;
	
	public Paragrafo(Sentenca sentenca, String paragrafo) {
		this.sentenca = sentenca;
		this.paragrafo = paragrafo;
		
		for(String elemento : sentenca.listaSentencas) {
			this.paragrafo += elemento;
		}
	}

	public Sentenca getSentenca() {
		return sentenca;
	}

	public void setSentenca(Sentenca sentenca) {
		this.sentenca = sentenca;
	}

	public String getParagrafo() {
		return paragrafo;
	}

	public void setParagrafo(String paragrafo) {
		this.paragrafo = paragrafo;
	}
	
	

}
