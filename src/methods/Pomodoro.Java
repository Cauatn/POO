package methods;

import utilities.ToDo;

public class Pomodoro {
    private ToDo lista;

    public int idMethod = 2;

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