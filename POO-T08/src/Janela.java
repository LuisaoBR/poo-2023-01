
public class Janela {
	
	private Menu menu;
	private Botao botao;
	private BarraRolagem barra;
	
	public Janela(Menu menu,Botao botao,BarraRolagem barra) {
		this.menu = menu;
		this.botao = botao;
		this.barra = barra;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Botao getBotao() {
		return botao;
	}

	public void setBotao(Botao botao) {
		this.botao = botao;
	}

	public BarraRolagem getBarra() {
		return barra;
	}

	public void setBarra(BarraRolagem barra) {
		this.barra = barra;
	}
	
	

}
