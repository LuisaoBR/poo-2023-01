package poo.com.github.computador;

public class Mouse extends Dispositivo {

	private int dpi;
	private boolean isRGB;

	public Mouse(String numSerie, String fabricante, int dpi, boolean isRGB) {
		super(numSerie, fabricante);
		this.dpi = dpi;
		this.isRGB = isRGB;
	}

	@Override
	public String toString() {
		return "Mouse [dpi=" + dpi + ", isRGB=" + isRGB + "]";
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	public boolean isRGB() {
		return isRGB;
	}

	public void setRGB(boolean isRGB) {
		this.isRGB = isRGB;
	}

}
