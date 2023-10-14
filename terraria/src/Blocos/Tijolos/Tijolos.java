package src.Blocos.Tijolos;
import src.Blocos.Bloco;

public abstract class Tijolos extends Bloco {
    private boolean explosivel;

    protected void setExplosivel(boolean explosivel){
        this.explosivel = explosivel;
    }
    public boolean getExplosivel(){
        return this.explosivel;
    }
    public String craftar(){
        if(getCraftavel()){
            return "Item craftável";
        }
        else{
            return "Item não craftável";
        }
    }
}
