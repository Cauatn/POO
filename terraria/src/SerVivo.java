package src;

public abstract class SerVivo implements Movimento {
    private int knockback;
    private int speed;
    private int attackSpeed;
    public int vida;
    private int dano;
    private int defesa;
    private int level;
    private int id;

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getKnockback() {
        return knockback;
    }

    public void setKnockback(int knockback) {
        this.knockback = knockback;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

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

    @Override
    public void moverDir() {
        // TODO Auto-generated method stub

    }

    @Override
    public void movierEsq() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pular() {
        // TODO Auto-generated method stub

    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub

    }
}