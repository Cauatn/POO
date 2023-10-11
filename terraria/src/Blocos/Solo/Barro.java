package src.Blocos.Solo;

import java.util.Random;

public class Barro extends Solo {

    public Barro(){
        Random random = new Random();
        setConversivel(false);
        setId(random.nextInt(9000) + 1000);
    }

    @Override
    public String quebrar() {
        return "Barro Quebrado";
    }

    @Override
    public String colocar() {
        return "Barro Colocado";
    }
}
