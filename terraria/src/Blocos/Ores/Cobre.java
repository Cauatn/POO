package src.Blocos.Ores;

import java.util.Random;

public class Cobre extends Ores {
    public Cobre(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
    }

    @Override
    public String quebrar() {
        return "Ore de Cobre Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Cobre Colocado";
    }
}
