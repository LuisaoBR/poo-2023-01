package festa;

public class Convidado extends Pessoa {
	
	private Convite convite;
	private Danca danca;
	
	public Convidado(String nome,int idade,String sexo,Convite convite,Danca danca) {
		super(nome,idade,sexo);
		this.convite = convite;
		this.danca = danca;
	}

	public Convite getConvite() {
		return convite;
	}

	public void setConvite(Convite convite) {
		this.convite = convite;
	}
	
	

	public Danca getDanca() {
		return danca;
	}

	public void setDanca(Danca danca) {
		this.danca = danca;
	}

	@Override
	public String toString() {
		return "Convidado [convite=" + convite + ", danca=" + danca + "]";
	}

	
	
	

}
