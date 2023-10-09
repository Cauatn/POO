package src.Blocos.GrownBlocks;

import java.util.Random;

public class MadeiraCoqueiro extends GrownBlocks {
    public MadeiraCoqueiro(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Biomas Oceânicos | Desertos");
        setDropaddoPor("Coqueiros");
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
