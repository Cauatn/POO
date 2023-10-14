package src.Blocos.OtherFoundBlocks;

import java.util.Random;

public class ColmeiaDeAbelhas extends OtherFoundBlocks {
    public ColmeiaDeAbelhas(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Colmeia de Abelhas");
        setCraftavel(false);
        setLooteavel(true);
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Colmeia de Abelhas Quebrada";
    }

    @Override
    public String colocar() {
        return "Colmeia de Abelhas Colocada";
    }
}
