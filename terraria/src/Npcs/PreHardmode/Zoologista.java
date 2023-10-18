package src.Npcs.PreHardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Zoologista extends Npc implements Interacoes{

    public Zoologista(){
        setAmbiente("Qualquer ambiente");
        setDano(8);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Witch doctor");
        setOdeia("Traficante de armas");
    }
    
    public static void main(String [] args){
        System.out.println("Oii");
    }

    @Override
    public String falar() {
        return "Zoologista";
    }
}