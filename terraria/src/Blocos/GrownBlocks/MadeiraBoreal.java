package src.Blocos.GrownBlocks;

import java.util.Random;

public class MadeiraBoreal extends GrownBlocks{
    public MadeiraBoreal(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Biomas de Neve");
        setDropaddoPor("Árvores Boreais");
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
