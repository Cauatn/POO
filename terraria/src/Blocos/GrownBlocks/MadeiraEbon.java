package src.Blocos.GrownBlocks;

import java.util.Random;

public class MadeiraEbon extends GrownBlocks {
    public MadeiraEbon(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("A Corrupção");
        setDropaddoPor("Árvores Corruptas");
    }

    @Override
    public String quebrar() {
        return "Madeira Ebon Quebrada";
    }

    @Override
    public String colocar() {
        return "Madeira Ebon Colocada";
    }
}
