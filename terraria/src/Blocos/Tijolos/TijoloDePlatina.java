package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDePlatina extends Tijolos {

    public TijoloDePlatina(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(true);
    }

    @Override
    public String quebrar() {
        return "Tijolo de Platina Quebrado";
    }

    @Override
    public String colocar() {
        return "Tijolo de Platina Colocado";
    }
}
