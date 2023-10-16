package src.Bosses.PreHardmode;

import src.Bosses.Boss;

public class Skeletron extends Boss {
    public Skeletron(){
        setDano(32);
        setDefesa(12);
        setVida(4400);
        setAmbienteSpawn("Entrada da Dungeon");
        setKnockBackResist(100);
        setSpawnItem("Old Man");
        setAchievements("Boned");
        setDrop("5 coin");
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