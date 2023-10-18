package src.Npcs;

import src.SerVivo;
import src.Personagem.Inventario;

public abstract class Npc extends SerVivo{

    private int KB_Resist;
    private String Ambiente;
    private String Gosta;
    private String Odeia;
    
    Inventario Inventario;
    
    public String getAmbiente() {
        return Ambiente;
    }

    public String getGosta() {
        return Gosta;
    }
    public String getOdeia() {
        return Odeia;
     }
    
    public int getKB_Resist() {
        return KB_Resist;
    }

    public void setKB_Resist(int kB_Resist) {
        this.KB_Resist = kB_Resist;
    }
    
    public void setAmbiente(String ambiente) {
        this.Ambiente = ambiente;
    }

    public void setOdeia(String odeia) {
        Odeia = odeia;
    }

    public void setGosta(String gosta) {
        Gosta = gosta;
    }
}