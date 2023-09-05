public class ClassesAnatomy {
    public static void main(String [] args) {
        //variaveis constantes devem ser expressas só em maiusculo ex:
        
        String NOME = "Cauã";
        double PI = 3.14;
        int ANO = 2023;


        // Criando primeira função

        int a = 10;
        int b = 9;

        System.out.println(soma(a,b));

        //tipos
        float exemplo = 3.1F;
        long numero = 931288981389018901L;

        // Teste funçao if else
        System.out.println(exemploIf(a, b));

        //concat 

        System.out.println("a"+1);
        System.out.println(1+1+1+1+1+"1");
        System.out.println(1+"1"+1+"1");

        //
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
        

    }

    public static int soma(int a, int b){
       return a + b;
    }

    public static boolean exemploIf(int a, int b){
        boolean resultado;

        if(a > b) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}