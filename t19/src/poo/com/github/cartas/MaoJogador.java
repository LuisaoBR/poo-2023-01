package poo.com.github.cartas;

import poo.com.github.cartas.Carta;

import java.util.ArrayList;

public class MaoJogador {

    ArrayList <Carta> mao = new ArrayList<>();
    private Monte monte;

    public MaoJogador(Monte monte){
        this.monte = monte;
    }

    public void addCarta(Carta carta){
        mao.add(carta);
        monte.removeCarta(carta);
    }

    public void removeCarta(Carta carta){
        mao.remove(carta);
        monte.addCarta(carta);
    }

    public void mostraMao(){
        for(Carta elemento : mao){
            System.out.println(elemento);
        }
    }
}
