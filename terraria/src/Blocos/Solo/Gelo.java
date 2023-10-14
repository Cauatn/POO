package src.Blocos.Solo;

import java.util.Random;

public class Gelo extends Solo {

    public Gelo(){
        Random random = new Random();
        setConversivel(true);
        setId(random.nextInt(9000) + 1000);
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Gelo Quebrado";
    }

    @Override
    public String colocar() {
        return "Gelo Colocado";
    }
}
