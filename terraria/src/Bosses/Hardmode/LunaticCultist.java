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

    public String falar(String nome) {
        return (nome + ", prepare-se para o seu fim!");
    }

    public String falar(int aleatorio) {
        switch (aleatorio) {
            case 1:
                return "Você vai morrer";
            case 2:
                return "Como ousas me desafiar?";
            case 3:
                return "Você ainda está aqui?";
            case 4:
                return "Renda-se";
            default:
                return "Não me subestime";
        }
    }
}