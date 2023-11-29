package src.Items.Armas.Melle.Espadas;

import src.Items.Arma;

public class Espada implements Arma {
    int Dano;
    int KnockBack;
    int critical_Chance;
    int Use_time;
    int Venda;
    Void Tooltip;

    public String Atacar(){
        return "Ataque Normal";
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

}
