package src.Blocos.Ores;

import java.util.Random;

public class Tungstenio extends Ores {
    public Tungstenio(){
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