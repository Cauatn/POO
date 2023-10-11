package src.Blocos.Solo;

import java.util.Random;

public class Terra extends Solo {

    public Terra(){
        Random random = new Random();
        setConversivel(true);
        setId(random.nextInt(9000) + 1000);
    }

    @Override
    public String quebrar() {
        return "Terra Quebrada";
    }

    @Override
    public String colocar() {
        return "Terra Colocada";
    }
}
