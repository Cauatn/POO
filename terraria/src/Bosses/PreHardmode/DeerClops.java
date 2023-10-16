package src.Bosses.PreHardmode;

import src.Bosses.Boss;

public class DeerClops extends Boss{
    public DeerClops(){
        setDano(25);
        setDefesa(10);
        setVida(7000);
        setAmbienteSpawn("Bioma de Neve com Chuva");
        setKnockBackResist(100);
        setSpawnItem("Deer Thing");
        setAchievements("An Eye For An Eye");
        setDrop("5 coins");
        //!setLevel();
    }

    @Override
    public String attack() {
        return "a";
    }

    @Override
    public String damage() {
        return "a";
    }
    
    @Override
    public String walk() {
        return "b";
    }
}
