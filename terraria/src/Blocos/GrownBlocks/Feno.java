package src.Blocos.GrownBlocks;

import java.util.Random;

public class Feno extends GrownBlocks {
    public Feno(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Todos biomas com grama");
        setDropaddoPor("Grama");
    }

    @Override
    public String quebrar() {
        return "Feno quebrado";
    }

    @Override
    public String colocar() {
        return "Feno colocado";
    }
}
