package src.Npcs.PreHardmode;

//import src.Npcs.Interacoes;
import src.Npcs.Npc;
import src.Personagem.Inventario;

public class Enfermeira extends Npc /* implements Interacoes */ {

    public Enfermeira() {
        setAmbiente("Qualquer ambiente");
        setDano(8);
        setDefesa(15);
        setKB_Resist(50);
        setVida(250);
        setGosta("Traficante de armas");
        setOdeia("Zoologista");
        Inventario = new Inventario(9, 0);
    }

    @Override
    public void LojaAtual() {

    }

    @Override
    public void emocional() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emocional'");
    }
}