package src.Blocos.Ores;

import java.util.Random;

public class Iron extends Ores {
    public Iron(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
    }

    @Override
    public String quebrar() {
        return "Ore de Iron Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Iron Colocado";
    }
}
