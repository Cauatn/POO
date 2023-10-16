package src.Bosses;

import java.util.ArrayList;

import src.SerVivo;

public abstract class Boss extends SerVivo{
    String ambienteSpawn;
    int knockBackResist;
    String spawnItem;
    String achievements;
    String drop;
    ArrayList<String> imune;

    public String getAmbienteSpawn() {
        return ambienteSpawn;
    }
    protected void setAmbienteSpawn(String ambienteSpawn) {
        this.ambienteSpawn = ambienteSpawn;
    }
    public int getKnockBackResist() {
        return knockBackResist;
    }
    protected void setKnockBackResist(int knockBackResist) {
        this.knockBackResist = knockBackResist;
    }
    public String getSpawnItem() {
        return spawnItem;
    }
    protected void setSpawnItem(String spawnItem) {
        this.spawnItem = spawnItem;
    }
    public String getAchievements() {
        return achievements;
    }
    protected void setAchievements(String achievements) {
        this.achievements = achievements;
    }
    public String getDrop() {
        return drop;
    }
    protected void setDrop(String drop) {
        this.drop = drop;
    }
    public ArrayList<String> getImune() {
        return imune;
    }
    protected void setImune(ArrayList<String> imune) {
        this.imune = imune;
    }

    public abstract String attack();
    public abstract String damage();
    public abstract String walk();
}