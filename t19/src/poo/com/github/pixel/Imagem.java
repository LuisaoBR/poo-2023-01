package poo.com.github.pixel;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

	List<Pixel> pixels = new ArrayList<>();

	public Imagem() {

	}

	public void addPixel(Pixel pixel) {
		pixels.add(pixel);
	}

	public void mostraImagem() {
		for (Pixel elemento : pixels) {
			System.out.println(elemento);
		}
	}

}
