package festa;

public class Musica {
	
	private String artista;
	private String titulo;
	
	public Musica(String artista,String titulo) {
		this.artista = artista;
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Musica [artista=" + artista + ", titulo=" + titulo + "]";
	}
	
	

}
