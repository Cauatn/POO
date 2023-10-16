package src;

import src.Personagem.Inventario;

public class Mob extends SerVivo{

    private int Dano_Contato;
    
    Inventario Inventario;

    public int getDano_Contato() {
        return Dano_Contato;
    }
    protected void setDano_Contato(int dano_Contato) {
        Dano_Contato = dano_Contato;
    }
}
