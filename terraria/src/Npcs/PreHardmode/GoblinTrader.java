package src.Npcs.PreHardmode;

import src.Npcs.Npc;
import src.Npcs.Interacoes;

public class GoblinTrader extends Npc implements Interacoes{

    public GoblinTrader(){
        setAmbiente("Caverna");
        setDano(15);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
    }
    @Override
    public String falar() {
        return "GoblinTrader";
    }
    @Override
    public void defender() {
    }
<<<<<<< HEAD

    @Override
    public void atacar(){

    }

    @Override
    public void defender(){

    }

    @Override
    public void movimentar(){
        
    }

=======
>>>>>>> e31ed13702c73a594580b60e53733383e08a9ae6
}