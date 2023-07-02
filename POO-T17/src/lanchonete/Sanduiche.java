package lanchonete;


public class Sanduiche {
	
	private String tipoPao;
	private String tipoCarne;
	private String molho;
	private boolean temSalada;
	
	public Sanduiche(String tipoPao,String tipoCarne,String molho,boolean temSalada) {
		this.tipoPao = tipoPao;
		this.tipoCarne = tipoCarne;
		this.molho = molho;
		this.temSalada = temSalada;
	}

	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public boolean isTemSalada() {
		return temSalada;
	}

	public void setTemSalada(boolean temSalada) {
		this.temSalada = temSalada;
	}

	@Override
	public String toString() {
		return "Sanduiche [tipoPao=" + tipoPao + ", tipoCarne=" + tipoCarne + ", molho=" + molho + ", temSalada="
				+ temSalada + "]";
	}
	
	
	

}
