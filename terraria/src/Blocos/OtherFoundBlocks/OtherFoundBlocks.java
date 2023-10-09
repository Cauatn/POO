package src.Blocos.OtherFoundBlocks;
import src.Blocos.*;

public abstract class OtherFoundBlocks extends Bloco {
    private String ambiente;
    private boolean looteavel;
    private boolean craftavel;

    protected void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    protected void setCraftavel(boolean craftavel) {
        this.craftavel = craftavel;
    }
    protected void setLooteavel(boolean looteavel) {
        this.looteavel = looteavel;
    }
    public String getAmbiente() {
        return this.ambiente;
    }
    public boolean getLooteavel() {
        return this.looteavel;
    }
    public boolean getCraftavel() {
        return this.craftavel;
    }
}
