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
        return "Ore de Tungstenio Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Tungstenio Colocado";
    }
}