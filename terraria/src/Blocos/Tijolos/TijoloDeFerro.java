package src.Blocos.Tijolos;

import java.util.Random;

public class TijoloDeFerro extends Tijolos {
    
    public TijoloDeFerro(){
        Random random = new Random();
        setExplosivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(true);
    }

    @Override
    public String quebrar() {
        return "Tijolo de Ferro Quebrado";
    }

    @Override
    public String colocar() {
        return "Tijolo de Ferro Colocado";
    }
}
