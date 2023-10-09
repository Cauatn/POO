package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloCinza extends Tijolos {
    public TijoloCinza(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
        //setNome(nome);
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
