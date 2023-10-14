package src.Bosses.PreHarmode;

import src.Bosses.Boss;

public class KingSlime extends Boss {
    public KingSlime(){
        setDano(40);
        setDefesa(10);
        setVida(2000);
        setAmbienteSpawn("Floresta | Chuva de Slime");
        setKnockBackResist(100);
        setSpawnItem("Coroa Slime");
        setAchievements("Slippery Shinobi | Sticky Situation");
        setDrop("1 coin");
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
}