package src.Blocos.GrownBlocks;

import java.util.Random;

public class Madeira extends GrownBlocks {
    public Madeira(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Florestas");
        setDropaddoPor("Árvores");
    }

    @Override
    public String quebrar() {
        return "ll";
    }

    @Override
    public String colocar() {
        return "ll";
    }
}
