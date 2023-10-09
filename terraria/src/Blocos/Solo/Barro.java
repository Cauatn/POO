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
        return "mm";
    }

    @Override
    public String colocar() {
        return "ii";
    }
}
