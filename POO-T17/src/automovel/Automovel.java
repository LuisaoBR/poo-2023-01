package automovel;

public class Automovel {
	
	private Pessoa pessoa;
	private String marca;
	private String modelo;
	private String ano;
	
	public Automovel(Pessoa pessoa,String marca,String modelo,String ano) {
		this.pessoa = pessoa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Automovel [pessoa=" + pessoa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
	
	

}
