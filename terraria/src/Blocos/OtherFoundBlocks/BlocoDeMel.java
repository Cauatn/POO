package src.Blocos.OtherFoundBlocks;

import java.util.Random;

public class BlocoDeMel extends OtherFoundBlocks {
    public BlocoDeMel(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Selva Subterrânea");
        setCraftavel(true);
        setLooteavel(true);
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
