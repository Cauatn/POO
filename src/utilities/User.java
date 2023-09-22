package utilities;

import methods.*;

public class User {
    private String name;
    private int Metodo;

    
    //*getters e setters
    public void setNome(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMetodo(int metodo) {
        Metodo = metodo;
    }
    public int getMetodo() {
        return Metodo;
    }
}
