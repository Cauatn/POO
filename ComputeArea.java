import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args){
        System.out.println("Onde estava Andressa em 11 de setembro ?");

        Scanner input = new Scanner(System.in);

        String texto = input.nextLine();
        input.close();

        boolean value = texto.equals("ninguem sabe");

        if(value) {
            System.out.println("Pse ne...");
        } else {
            System.out.println("Provavelmente mentira");
        }

    }
}