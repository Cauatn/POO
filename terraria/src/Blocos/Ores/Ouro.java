package src.Blocos.Ores;

import java.util.Random;

public class Ouro extends Ores {
    public Ouro(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Ore de Ouro Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Ouro Colocado";
    }
}
