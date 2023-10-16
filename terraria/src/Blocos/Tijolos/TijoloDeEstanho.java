package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDeEstanho extends Tijolos {
    public TijoloDeEstanho(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(true);
    }
    
    @Override
    public String quebrar() {
        return "Tijolo de Estanho Quebrado";
    }

    @Override
    public String colocar() {
        return "Tijolo de Estanho Colocado";
    }
}
