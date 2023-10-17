package src;

public interface Comportamento {

    //Esse metodo tera seu tipo de retorno modificado baesado no tipo de defesa que cada npc pode fazer
    public abstract void atacar();
    public abstract void defender();
    public abstract void movimentar();
}
