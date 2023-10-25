package src.Npcs.PreHardmode;

import src.Npcs.Interacoes;
import src.Npcs.Npc;

public class Enfermeira extends Npc implements Interacoes{

    public Enfermeira(){
        setAmbiente("Qualquer ambiente");
        setDano(8);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Traficante de armas");
        setOdeia("Zoologista");
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

    @Override
    public String falar(){
        return "asd";
    }
}