package src.Bosses.Hardmode;

import src.Bosses.Boss;

public class LunaticCultist extends Boss {
    public LunaticCultist(){
        setDano(56);
        setDefesa(37);
        setVida(32000);
        setAmbienteSpawn("Entrada da Dungeon");
        setKnockBackResist(100);
        //!setSpawnItem("");
        setAchievements("Obsessive Devotion");
        setDrop("10 coin");
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