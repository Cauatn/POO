package src.Blocos.Solo;

import java.util.Random;

public class Pedra extends Solo {

    public Pedra(){
        Random random = new Random();
        setConversivel(true);
        setId(random.nextInt(9000) + 1000);
    }

    @Override
    public String quebrar() {
        return "Pedra Quebrada";
    }

    @Override
    public String colocar() {
        return "Pedra Colocada";
    }
}
