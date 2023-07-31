package poo.com.github.objetomensagem;

public class Mensagem {

	private Objeto objOrigem;
	private Objeto objDestino;

	public Mensagem(Objeto objOrigem, Objeto objDestino) {
		this.objOrigem = objOrigem;
		this.objDestino = objDestino;
	}

	@Override
	public String toString() {
		return "Mensagem [objOrigem=" + objOrigem + ", objDestino=" + objDestino + "]";
	}

	public Objeto getObjOrigem() {
		return objOrigem;
	}

	public void setObjOrigem(Objeto objOrigem) {
		this.objOrigem = objOrigem;
	}

	public Objeto getObjDestino() {
		return objDestino;
	}

	public void setObjDestino(Objeto objDestino) {
		this.objDestino = objDestino;
	}

}
