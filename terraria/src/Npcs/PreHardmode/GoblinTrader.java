package src.Npcs.PreHardmode;

import src.Npcs.Npc;
//import src.Npcs.Interacoes;
import src.Personagem.Inventario;

public class GoblinTrader extends Npc /*implements Interacoes*/{

    public GoblinTrader(){
        setAmbiente("Caverna");
        setDano(15);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        Inventario = new Inventario(9, 0);
    }
    @Override
    public void falar() {
        return ;
    }
    @Override
    public void defender() {
    }

    @Override
    public void atacar(){

    }

    @Override
    public void movimentar(){
        
    }

    @Override
    public void LojaAtual(){

    }

}