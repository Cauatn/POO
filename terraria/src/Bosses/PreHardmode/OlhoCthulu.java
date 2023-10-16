package src.Bosses.PreHardmode;

import src.Bosses.Boss;

public class OlhoCthulu extends Boss {
    public OlhoCthulu(){
        setDano(25);
        setDefesa(12);
        setVida(2800);
        setAmbienteSpawn("Superfície + Noite | Espaço + Noite");
        setKnockBackResist(100);
        setSpawnItem("Olho Aparentemente Suspeito");
        setAchievements("Eye On You");
        setDrop("3 coin");
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