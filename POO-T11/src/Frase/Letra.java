package Frase;

public class Letra {
	
	private char letra;
	
	Letra(char letra){
		this.letra = letra;
	}
	
	public void mostrarLetra() {
		System.out.println(this.letra);
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	

}
