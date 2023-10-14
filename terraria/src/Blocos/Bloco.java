package src.Blocos;

public abstract class Bloco {
    private String nome;
    private int id;
    private boolean craftavel;

    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public boolean getCraftavel() {
        return this.craftavel;
    }
    protected void setCraftavel(boolean craftavel) {
        this.craftavel = craftavel;
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
