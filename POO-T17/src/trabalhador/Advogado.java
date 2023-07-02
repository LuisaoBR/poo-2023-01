package trabalhador;

public class Advogado extends Trabalhador {
	
	private String registroOab;
	private String areaDeAtuacao;
	
	public Advogado(String nome,String cpf,String carteiraDeTrabalho,String registroOab,String areaDeAtuacao) {
		super(nome,cpf,carteiraDeTrabalho);
		this.registroOab = registroOab;
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public String getRegistroOab() {
		return registroOab;
	}

	public void setRegistroOab(String registroOab) {
		this.registroOab = registroOab;
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	@Override
	public String toString() {
		return "Advogado [registroOab=" + registroOab + ", areaDeAtuacao=" + areaDeAtuacao + "]";
	}
	
	

}
