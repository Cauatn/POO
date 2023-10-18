package src.Npcs.PreHardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Druida extends Npc implements Interacoes{

    public Druida(){
        setAmbiente("Jungle");
        setDano(0);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa, Truflle");
        setOdeia("Golfista");
    }
    
    public static void main(String [] args){
        System.out.println("Oii");
    }

    @Override
    public String falar() {
        return "Druida";
    }

}