package poo.com.github.associacoes;

public class Estudante {
    private String nome;
    private String sexo;
    private Atividade atividade;

    public Estudante(String nome,String sexo,Atividade atividade){
        this.nome = nome;
        this.sexo = sexo;
        this.atividade = atividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", atividade=" + atividade +
                '}';
    }
}
