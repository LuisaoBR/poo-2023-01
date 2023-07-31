package poo.com.github.objetomensagem;

public class Objeto {

	private Mensagem mensagem;

	public Objeto(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Objeto [mensagem=" + mensagem + "]";
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

}
