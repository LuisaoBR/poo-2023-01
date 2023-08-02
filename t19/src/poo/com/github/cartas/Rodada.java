package poo.com.github.cartas;

import poo.com.github.cartas.Jogador;
import poo.com.github.cartas.Monte;

import java.util.ArrayList;

public class Rodada {

    private Monte monte;
    private int numRodada;
    ArrayList <Jogador> listaJogadores = new ArrayList<>();

    public Rodada(Monte monte,int numRodada){
        this.monte = monte;
        this.numRodada = numRodada;
    }

    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public void mostraJogadores(){
        for(Jogador elemento : listaJogadores){
            System.out.println(elemento);
        }
    }

    public Monte getMonte() {
        return monte;
    }

    public void setMonte(Monte monte) {
        this.monte = monte;
    }

    public int getNumRodada() {
        return numRodada;
    }

    public void setNumRodada(int numRodada) {
        this.numRodada = numRodada;
    }

    @Override
    public String toString() {
        return "poo.com.github.cartas.Rodada{" +
                "monte=" + monte +
                ", numRodada=" + numRodada +
                '}';
    }
}
