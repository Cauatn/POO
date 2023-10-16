package src;

public class World {
    private String Nome;
    private int Seed;
    private String Tamanho;
    private String Modo;
    private String Disease;
    private String Data_Criação;
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getSeed() {
        return Seed;
    }
    public void setSeed(int seed) {
        Seed = seed;
    }
    public String getTamanho() {
        return Tamanho;
    }
    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }
    public String getModo() {
        return Modo;
    }
    public void setModo(String modo) {
        Modo = modo;
    }
    public String getDisease() {
        return Disease;
    }
    public void setDisease(String disease) {
        Disease = disease;
    }
    public String getData_Criação() {
        return Data_Criação;
    }
    public void setData_Criação(String data_Criação) {
        Data_Criação = data_Criação;
    }
}
