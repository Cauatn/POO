package src.Blocos.Ores;
import src.Blocos.*;

public abstract class Ores extends Bloco {
    private String mineradoCom;
    private boolean explodivel;

    protected void setExplodivel(boolean explodivel) {
        this.explodivel = explodivel;
    }
    protected void setMineradoCom(String mineradoCom) {
        this.mineradoCom = mineradoCom;
    }
    public String getMineradoCom() {
        return this.mineradoCom;
    }
    public boolean getExplodivel() {
        return this.explodivel;
    }
}
