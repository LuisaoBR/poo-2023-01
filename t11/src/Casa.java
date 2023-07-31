import poo.com.github.casa.Area;
import poo.com.github.casa.Banheiro;
import poo.com.github.casa.Garagem;
import poo.com.github.casa.Quarto;
import poo.com.github.casa.Sala;

public class Casa {

	private double tamanho;
	private Area area;
	private Quarto quarto;
	private Banheiro banheiro;
	private Sala sala;
	private Garagem garagem;

	Casa() {

	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Banheiro getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Garagem getGaragem() {
		return garagem;
	}

	public void setGaragem(Garagem garagem) {
		this.garagem = garagem;
	}

}
