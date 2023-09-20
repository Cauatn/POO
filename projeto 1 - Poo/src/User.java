public class User {
    private String name; //* nome do user */
    
    //*getters e setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //*métodos
    public void changeName (String name){
        this.setName(name);
    }
    public String displayName (){
        return this.getName();
    }
}
