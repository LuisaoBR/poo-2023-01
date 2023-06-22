package ProjetoDeSoftware;

public class LinguagemProgramacao {
	
	private String nome;
	private boolean isCompilada;
	private int anoLancamento;
	
	LinguagemProgramacao(String nome, boolean isCompilada, int anoLancamento){
		this.nome = nome;
		this.isCompilada = isCompilada;
		this.anoLancamento = anoLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isCompilada() {
		return isCompilada;
	}

	public void setCompilada(boolean isCompilada) {
		this.isCompilada = isCompilada;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	

}
