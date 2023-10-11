package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDeCobre extends Tijolos {
    public TijoloDeCobre(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
    }
    
    @Override
    public String quebrar() {
        return "Tijolo de Cobre Quebrado";
    }

    @Override
    public String colocar() {
        return "Tijolo de Cobre Colocado";
    }
}
