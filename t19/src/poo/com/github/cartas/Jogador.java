package poo.com.github.cartas;

public class Jogador {

    private MaoJogador maoJogador;

    public Jogador(MaoJogador maoJogador){
        this.maoJogador = maoJogador;
    }

    @Override
    public String toString() {
        return "poo.com.github.cartas.Jogador{" +
                "maoJogador=" + maoJogador +
                '}';
    }

    public MaoJogador getMaoJogador() {
        return maoJogador;
    }

    public void setMaoJogador(MaoJogador maoJogador) {
        this.maoJogador = maoJogador;
    }
}
