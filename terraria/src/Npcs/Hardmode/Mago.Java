package src.Npcs.Hardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Mago extends Npc implements Interacoes {
    public Mago(){
        setAmbiente("The Hallow, Valid House");
        setDano(18);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa, Comerciante");
        setOdeia("Ciborgue");
    }

    @Override
    public String falar() {
        return "Mago";
    }

    @Override
    public void defender() {
    }
}
