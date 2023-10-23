package src;

import src.Personagem.Inventario;

public abstract class Player extends SerVivo{
    private int Vida_Maxima;
    private int Mana_Maxima;
    private int Horas_De_Jogo;
    
    Inventario Inventario;

    public int getVida_Maxima() {
        return Vida_Maxima;
    }

    protected void setVida_Maxima(int vida_Maxima) {
        Vida_Maxima = vida_Maxima;
    }

    public int getMana_Maxima() {
        return Mana_Maxima;
    }

    protected void setMana_Maxima(int mana_Maxima) {
        Mana_Maxima = mana_Maxima;
    }

    public int getHoras_De_Jogo() {
        return Horas_De_Jogo;
    }

    protected void setHoras_De_Jogo(int horas_De_Jogo) {
        Horas_De_Jogo = horas_De_Jogo;
    }
}
