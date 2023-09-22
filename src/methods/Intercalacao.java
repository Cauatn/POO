package methods;

import utilities.ToDo;
import config.*;

public class Intercalacao {
    private ToDo lista;

    public int idMethod = 1;

    public static void main(String[] args) {
        
    }

    public void setLista(ToDo lista) {
        this.lista = lista;
    }

    public ToDo getLista() {
        return lista;
    }

    public void setIdMethod(int idMethod) {
        this.idMethod = idMethod;
    }
    
    public int getIdMethod() {
        return idMethod;
    }
}