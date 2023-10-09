package src.Blocos.Solo;
import src.Blocos.*;

public abstract class Solo extends Bloco {
    private boolean conversivel;

    protected void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }
    public boolean getConversivel(){
        return this.conversivel;
    }
}
