package src.Blocos.Ores;

import java.util.Random;

public class Ouro extends Ores {
    public Ouro(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
    }

    @Override
    public String quebrar() {
        return "ll";
    }

    @Override
    public String colocar() {
        return "ll";
    }
}
