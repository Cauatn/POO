package src.Npcs.Hardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Ciborgue extends Npc implements Interacoes {
    public Ciborgue(){
        setAmbiente("Valid House");
        setDano(10);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa, Estilista, Pirata, SteamPunker");
        setOdeia("Mago");
    }

    @Override
    public String falar() {
        return "Ciborgue";
    }

    @Override
    public void defender() {
    }
    
}
