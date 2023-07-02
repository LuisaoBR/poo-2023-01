package festa;

public class Convite {
	
	private Pessoa pessoa;
	private int codigo;
	
	public Convite(Pessoa pessoa,int codigo) {
		this.pessoa = pessoa;
		this.codigo = codigo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Convite [pessoa=" + pessoa + ", codigo=" + codigo + "]";
	}
	
	

}
