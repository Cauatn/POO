package src.Blocos.GrownBlocks;

import java.util.Random;

public class Bambu extends GrownBlocks {
    public Bambu(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Selva");
        setDropaddoPor("Hastes de bambu");
    }

    @Override
    public String quebrar() {
        return "Bambu quebrado";
    }

    @Override
    public String colocar() {
        return "Bambu Colocado";
    }
}