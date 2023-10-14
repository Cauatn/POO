package src.Blocos.GrownBlocks;

import java.util.Random;

public class MadeiraBoreal extends GrownBlocks{
    public MadeiraBoreal(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Biomas de Neve");
        setDropaddoPor("Árvores Boreais");
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Madeira Boreal Quebrada";
    }

    @Override
    public String colocar() {
        return "Madeira Boreal Colocada";
    }
}
