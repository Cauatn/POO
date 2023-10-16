package src.Bosses.PreHardmode;

import src.Bosses.Boss;

public class ParedeDeCarne extends Boss {
    public ParedeDeCarne(){
        setDano(50);
        setDefesa(12);
        setVida(8000);
        setAmbienteSpawn("O Submundo");
        setKnockBackResist(100);
        setSpawnItem("Guide Voodoo Doll");
        setAchievements("Still Hungry | Its Hard | Challenge Accepted");
        setDrop("8 coin");
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