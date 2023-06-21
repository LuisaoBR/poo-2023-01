import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curva {
	private List<Ponto> pontos;

	public Curva() {
		pontos = new ArrayList<>();
	}

	public void adicionarPonto(Ponto ponto) {
		pontos.add(ponto);
		ordenarPontos();
	}

	private void ordenarPontos() {
		pontos.sort(Comparator.comparingDouble(Ponto::getX));
	}

	public List<Ponto> getPontos() {
		return pontos;
	}
}
