package src.Blocos.Ores;

import java.util.Random;

public class Platina extends Ores {
    public Platina(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setExplodivel(true);
        setMineradoCom("Cobre | Estanho");
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Ore de Platina Quebrado";
    }

    @Override
    public String colocar() {
        return "Ore de Platina Colocado";
    }
}
