package src.Npcs.PreHardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Guia extends Npc implements Interacoes{

    public Guia(){
        setAmbiente("Qualquer ambiente");
        setDano(10);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa, Zoologista, Princessa");
        setOdeia("Pintor");
    }
    
    public static void main(String [] args){
        System.out.println("Oii");
    }

    @Override
    public void atacar(){

    }

    @Override
    public void defender(){

    }

    @Override
    public void movimentar(){
        
    }

    @Override
    public String falar(){
        return "asd";
    }
}