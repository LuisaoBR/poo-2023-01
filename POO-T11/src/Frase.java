
public class Frase {
	
	private Palavra palavra;
	private String frase;
	
	Frase(){
		
	}
	
	public void addPalavra(Palavra palavra) {
		this.frase += palavra;
	}
	
	public void mostrarFrase() {
		System.out.println(frase);
	}

	public Palavra getPalavra() {
		return palavra;
	}

	public void setPalavra(Palavra palavra) {
		this.palavra = palavra;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	

}
