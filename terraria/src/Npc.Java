package src;

import src.Personagem.Inventario;

public class Npc extends SerVivo{

    private int KB_Resist;
    private String Ambiente;

    Inventario Inventario;
    
    public int getKB_Resist() {
        return KB_Resist;
    }
    public void setKB_Resist(int kB_Resist) {
        KB_Resist = kB_Resist;
    }
    public String getAmbiente() {
        return Ambiente;
    }
    public void setAmbiente(String ambiente) {
        Ambiente = ambiente;
    }
    
    
}