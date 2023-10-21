package src.Personagem;

public class Status {
    private int attackSpeed;
    private int damage;
    private int knockback;
    private int speed;
    private int defense;

    protected void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    protected void setDamage(int damage) {
        this.damage = damage;
    }
    protected void setDefense(int defense) {
        this.defense = defense;
    }
    protected void setKnockback(int knockback) {
        this.knockback = knockback;
    }
    protected void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getAttackSpeed() {
        return this.attackSpeed;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getKnockback() {
        return this.knockback;
    }
    public int getSpeed() {
        return this.speed;
    }
}
