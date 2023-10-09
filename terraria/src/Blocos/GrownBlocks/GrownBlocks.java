package src.Blocos.GrownBlocks;

import src.Blocos.*;

public abstract class GrownBlocks extends Bloco {
    private String ambiente;
    private String dropaddoPor;

    protected void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    protected void setDropaddoPor(String dropaddoPor) {
        this.dropaddoPor = dropaddoPor;
    }
    public String getAmbiente() {
        return this.ambiente;
    }
    public String getDropaddoPor() {
        return this.dropaddoPor;
    }
}
