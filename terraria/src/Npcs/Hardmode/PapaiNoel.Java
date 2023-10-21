package src.Npcs.Hardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class PapaiNoel extends Npc implements Interacoes {
    public PapaiNoel(){
        setAmbiente("Valid House");
        setDano(10);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa,");
        setOdeia("Coletor de Taxas");
    }

    @Override
    public String falar() {
        return "Papai Noel";
    }

    @Override
    public void defender() {
    }
    
}
