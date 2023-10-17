package src.Npcs.PreHardmode;

import src.Npcs.Npc;

public class GoblinTrader extends Npc{

    public GoblinTrader(){
        setAmbiente("Caverna");
        setDano(15);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
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

}