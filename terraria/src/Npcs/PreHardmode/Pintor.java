package src.Npcs.PreHardmode;

import src.Npcs.Npc;
import src.Personagem.Inventario;

public class Pintor extends Npc {

    public Pintor() {
        setAmbiente("Qualquer ambiente");
        setDano(10);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Princesa, Zoologista, Princessa");
        setOdeia("Pintor");
        Inventario = new Inventario(9, 0);
    }

    @Override
    public void LojaAtual() {

    }

    @Override
    public void emocional() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emocional'");
    }

}