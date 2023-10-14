package src.Blocos.Solo;

import java.util.Random;

public class Areia extends Solo {

    public Areia(){
        Random random = new Random();
        setConversivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Areia Quebrada";
    }

    @Override
    public String colocar() {
        return "Areia Colocada";
    }
}
