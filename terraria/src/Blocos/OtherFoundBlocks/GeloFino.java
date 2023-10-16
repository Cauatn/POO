package src.Blocos.OtherFoundBlocks;

import java.util.Random;

public class GeloFino extends OtherFoundBlocks {
    public GeloFino(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Neve, Bioma de Gelo");
        setCraftavel(true);
        setLooteavel(false);
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Gelo Fino Quebrado";
    }

    @Override
    public String colocar() {
        return "Gelo Fino Colocado";
    }
}
