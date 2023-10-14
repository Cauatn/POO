package src.Blocos.GrownBlocks;

import java.util.Random;

public class MadeiraCoqueiro extends GrownBlocks {
    public MadeiraCoqueiro(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Biomas Oceânicos | Desertos");
        setDropaddoPor("Coqueiros");
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Madeira Coqueiro Quebrada";
    }

    @Override
    public String colocar() {
        return "Madeira Coqueiro Colocada";
    }
}
