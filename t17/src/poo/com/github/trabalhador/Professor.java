package poo.com.github.trabalhador;

public class Professor extends Trabalhador {

	private String escola;
	private String areaDeEstudo;

	public Professor(String nome, String cpf, String areaDeAtuacao, String escola, String areaDeEstudo) {
		super(nome, cpf, areaDeAtuacao);
		this.escola = escola;
		this.areaDeEstudo = areaDeEstudo;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getAreaDeEstudo() {
		return areaDeEstudo;
	}

	public void setAreaDeEstudo(String areaDeEstudo) {
		this.areaDeEstudo = areaDeEstudo;
	}

	@Override
	public String toString() {
		return "Professor [escola=" + escola + ", areaDeEstudo=" + areaDeEstudo + "]";
	}

}
