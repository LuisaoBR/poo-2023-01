package poo.com.github.disco;

public class Usuario {

	private String nome;
	private String cpf;
	private Permissao permissao;

	public Usuario(String nome, String cpf, Permissao permissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.permissao = permissao;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", permissao=" + permissao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

}
