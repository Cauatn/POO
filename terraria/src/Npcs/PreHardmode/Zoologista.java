package src.Npcs.PreHardmode;

import src.Npcs.Npc;
import src.Personagem.Inventario;

public class Zoologista extends Npc {

    public Zoologista(){
        setAmbiente("Qualquer ambiente");
        setDano(8);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Witch doctor");
        setOdeia("Traficante de armas");
        Inventario = new Inventario(9, 0);
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

    @Override
    public void falar(){
        return ;
    }

    @Override
    public void LojaAtual(){

    }

}