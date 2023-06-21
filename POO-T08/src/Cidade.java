
public class Cidade {
	
	private String nome;
	private boolean isCapital;
	private String estado;
	private Pais pais;
	
	public Cidade(String nome, boolean isCapital, String estado, Pais pais) {
		this.nome = nome;
		this.isCapital = isCapital;
		this.estado = estado;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	

}
