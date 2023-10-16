package src.Blocos.OtherFoundBlocks;

import java.util.Random;

public class BlocoDeFolha extends OtherFoundBlocks {
    public BlocoDeFolha(){
        Random random = new Random();
        setId(random.nextInt(9000) + 1000);
        setAmbiente("Árvore Viva");
        setCraftavel(false);
        setLooteavel(false);
        setCraftavel(false);
    }

    @Override
    public String quebrar() {
        return "Bloco de Folha Quebrado";
    }

    @Override
    public String colocar() {
        return "Bloco de Folha Colocado";
    }
}
