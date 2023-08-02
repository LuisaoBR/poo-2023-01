package poo.com.github.cartas;

import poo.com.github.cartas.Carta;

import java.util.ArrayList;

public class Monte {

    ArrayList <Carta> monte = new ArrayList<>();

    public Monte(){

    }

    public void addCarta(Carta carta){
        monte.add(carta);
    }

    public void removeCarta(Carta carta){
        monte.remove(carta);
    }

    public void mostraMonte(){
        for(Carta elemento : monte){
            System.out.println(elemento);
        }
    }
}
