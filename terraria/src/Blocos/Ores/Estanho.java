package src.Blocos.Ores;

import java.util.Random;

public class Estanho extends Ores {
    public Estanho(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
    }

    @Override
    public String quebrar() {
        return "Ore de Estanho Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Estanho Colocado";
    }
}
