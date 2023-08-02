package poo.com.github.associacoes;

public class Atividade {
    private String descricao;
    private Usuario usuario;
    private Estudante estudante;

    public Atividade(String descricao,Usuario usuario,Estudante estudante){
        this.descricao = descricao;
        this.usuario = usuario;
        this.estudante = estudante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "descricao='" + descricao + '\'' +
                ", usuario=" + usuario +
                ", estudante=" + estudante +
                '}';
    }
}
