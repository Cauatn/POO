package src.Personagem;

import src.SerVivo;

public abstract class Personagem extends SerVivo {
    private String hair;
    private String skin;
    private String eyes;

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEyes() {
        return this.eyes;
    }

    public String getHair() {
        return this.hair;
    }

    public String getSkin() {
        return this.skin;
    }
}
