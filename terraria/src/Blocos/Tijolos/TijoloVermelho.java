package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloVermelho extends Tijolos {

    public TijoloVermelho(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
    }

    @Override
    public String quebrar() {
        return "ww";
    }
    @Override
    public String colocar() {
        return "lpp";
    }
}
