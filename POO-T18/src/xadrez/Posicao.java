package xadrez;

public class Posicao {
	
	private String x;
	private int y;
	private boolean isOrigem;
	private boolean isDestino;
	//private Peca peca;
	
	public Posicao(String x,int y,boolean isOrigem) {
		this.x = x;
		this.y = y;
		this.isOrigem = isOrigem;
		
		
		if(isOrigem == true) {
			this.isDestino = false;
		}
		else {
			this.isDestino = true;
		}
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isOrigem() {
		return isOrigem;
	}

	public void setOrigem(boolean isOrigem) {
		this.isOrigem = isOrigem;
	}

	public boolean isDestino() {
		return isDestino;
	}

	public void setDestino(boolean isDestino) {
		this.isDestino = isDestino;
	}

	@Override
	public String toString() {
		return "Posicao [x=" + x + ", y=" + y + ", isOrigem=" + isOrigem + ", isDestino=" + isDestino + "]";
	}
	
	
	
	

}
