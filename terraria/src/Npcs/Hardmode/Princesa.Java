package src.Npcs.Hardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Princesa extends Npc implements Interacoes {
    public Princesa(){
        setAmbiente("The Hallow, Valid House");
        setDano(10);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Ninguem");
        setOdeia("Ninguem");
        Inventario = new Inventario(9, 0);
    }

    @Override
    public String falar() {
        return "Princesa";
    }

    @Override
    public void defender() {
    }
}
