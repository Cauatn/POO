package src.Blocos.OtherFoundBlocks;

import java.util.Random;


public class MadeiraViva extends OtherFoundBlocks {

    public MadeiraViva(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Árvore Viva");
        setCraftavel(false);
        setLooteavel(false);
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
