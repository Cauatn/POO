package src.Blocos;

public abstract class Bloco {
    private String nome;
    private int id;

    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    protected void setId(int id) {
        this.id = id;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String quebrar();
    public abstract String colocar();
}
