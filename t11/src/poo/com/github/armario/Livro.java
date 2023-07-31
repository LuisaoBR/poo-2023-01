package poo.com.github.armario;

public class Livro {

	private String autor;
	private String titulo;
	private String editora;

	Livro(String autor, String titulo, String editora) {
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
