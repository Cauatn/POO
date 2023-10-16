package src.Blocos.GrownBlocks;

import java.util.Random;

public class Cactus extends GrownBlocks {
    public Cactus(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Deserto");
        setDropaddoPor("Cactus");
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Cacto quebrado";
    }

    @Override
    public String colocar() {
        return "Cacto Colocado";
    }
}
