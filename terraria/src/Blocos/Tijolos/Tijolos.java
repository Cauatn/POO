package src.Blocos.Tijolos;
import src.Blocos.*;

public abstract class Tijolos extends Bloco {
    private boolean explosivel;

    protected void setExplosivel(boolean explosivel){
        this.explosivel = explosivel;
    }
    public boolean getExplosivel(){
        return this.explosivel;
    }
}
