package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDeGelo extends Tijolos {
    
    public TijoloDeGelo(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(true);
    }
    
    @Override
    public String quebrar() {
        return "Tijolo de Gelo Quebrado";
    }

    @Override
    public String colocar() {
        return "Tijolo de Gelo Colocado";
    }
}
