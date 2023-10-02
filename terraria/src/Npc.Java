package src;

import src.Personagem.Inventario;

public class Npc extends SerVivo{

    int KB_Resist;
    String Ambiente;

    Inventario Inventario;

    
}

public static void main(String [] args){
    Npc p = new Npc();
    Player a = new Player();
    System.out.println(p.toString());
    System.out.println(a.toString());
}

public String toString(){
    return "asd";
}