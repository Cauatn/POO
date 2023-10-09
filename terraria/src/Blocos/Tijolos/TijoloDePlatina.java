package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDePlatina extends Tijolos {

    public TijoloDePlatina(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
    }

    @Override
    public String quebrar() {
        return "ll";
    }

    @Override
    public String colocar() {
        return "00";
    }
}
