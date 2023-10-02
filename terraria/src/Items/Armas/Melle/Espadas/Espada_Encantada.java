package src.Items.Armas.Melle.Espadas;

public class Espada_Encantada extends Espada{
    public static void main(String [] args){
        Espada exemplo1 = new Espada();
        Espada_Encantada exemplo = new Espada_Encantada();

        System.out.println(exemplo.Atacar());
        System.out.println(exemplo1.Atacar());

        return;
    }

    public String Atacar(){
        return "Ataque com estrela";
    }
}
