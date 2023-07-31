package poo.com.github.computador;

public class UfgPc extends Computador{
	private Aluno aluno;
	
	public UfgPc(Aluno aluno,String marca,String modelo) {
		super(marca,modelo);
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "UfgPc [aluno=" + aluno + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
	

}
