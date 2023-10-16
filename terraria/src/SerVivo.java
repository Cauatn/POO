package src;

public abstract class SerVivo {
    public int vida;
    private int dano;
    private int defesa;
    private int level;
    private int id;
    
    public int getVida() {
        return vida;
    }
    protected void setVida(int vida) {
        this.vida = vida;
    }
    public int getDano() {
        return dano;
    }
    protected void setDano(int dano) {
        this.dano = dano;
    }
    public int getDefesa() {
        return defesa;
    }
    protected void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getLevel() {
        return level;
    }
    protected void setLevel(int level) {
        this.level = level;
    }
    public int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }
}