package poo.com.github.disco;

public class Arquivo {

	private Permissao permissao;
	private String descricao;

	public Arquivo(Permissao permissao, String descricao) {
		this.permissao = permissao;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Arquivo [permissao=" + permissao + ", descricao=" + descricao + "]";
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
