package src;

public interface Comportamento {

    //Esses metodo tera seu tipo de retorno modificado baesado no tipo de ação que cada npc pode fazer
    public abstract void falar();
    public abstract void defender();
    public abstract void LojaAtual();
    public abstract void atacar();
    public abstract void movimentar();
    
}
