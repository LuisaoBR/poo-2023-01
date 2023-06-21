
public class Compartimento {
	
	private Livro[] livros;
	private CD[] cds;
	private int qtdLivros;
	private int qtdCDs;
	
	Compartimento(int capacidadeCDs){
		livros = new Livro[3];
		qtdLivros = 0;
		cds = new CD[capacidadeCDs];
		qtdCDs = 0;
		
	}
	
	public void addLivro(Livro livro) {
		if(qtdLivros < 3) {
			livros[qtdLivros] = livro;
			qtdLivros++;
		}
		else {
			System.out.println("Excedeu o numero de livros!");
		}
	}
	
	public void mostrarLivros() {
		System.out.println("Livros no compartimento:");
		for(int i = 0; i < qtdLivros; i++) {
			System.out.println("Livro: "+livros[i].getTitulo()+" Autor: "+livros[i].getAutor());
		}
	}
	
	public void addCD(CD cd) {
		if(qtdCDs < cds.length) {
			cds[qtdCDs] = cd;
			qtdCDs++;
		}
		else {
			System.out.println("Nao foi possivel adicionar esse CD!");
		}
	}
	
	public void mostrarCDs() {
		System.out.println("CDs no compartimento:");
		for(int i = 0; i < qtdCDs; i++) {
			System.out.println("CD: "+cds[i].getTitulo()+" Artista: "+cds[i].getArtista());
		}
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	public CD[] getCds() {
		return cds;
	}

	public void setCds(CD[] cds) {
		this.cds = cds;
	}

	public int getQtdLivros() {
		return qtdLivros;
	}

	public void setQtdLivros(int qtdLivros) {
		this.qtdLivros = qtdLivros;
	}

	public int getQtdCDs() {
		return qtdCDs;
	}

	public void setQtdCDs(int qtdCDs) {
		this.qtdCDs = qtdCDs;
	}
	
	
	
	

}
