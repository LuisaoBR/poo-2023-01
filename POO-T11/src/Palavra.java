

public class Palavra {
	
	private Letra letra;
	private String palavra;
	
	Palavra(){
		
	}
	
	public void addLetra(Letra letra) {
		this.palavra += letra;
	}
	
	public void mostrarPalavra() {
		System.out.println(palavra);
	}

	public Letra getLetra() {
		return letra;
	}

	public void setLetra(Letra letra) {
		this.letra = letra;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	

}
