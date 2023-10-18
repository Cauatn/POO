package src;

public class Movimento {

    private int posicaoEixoX;
    private int posicaoEixoY;

    private int getPosicaoEixoX() {
        return posicaoEixoX;
    }
    private void setPosicaoEixoX(int posicaoEixoX) {
        this.posicaoEixoX = posicaoEixoX;
    }
    private int getPosicaoEixoY() {
        return posicaoEixoY;
    }
    private void setPosicaoEixoY(int posicaoEixoY) {
        this.posicaoEixoY = posicaoEixoY;
    }

    public void andarDireita(){
        setPosicaoEixoX(this.getPosicaoEixoX()+1);
    }
    public void andarEsquerda(){
        setPosicaoEixoX(this.getPosicaoEixoX()-1);
    }
    public void pular() throws InterruptedException {
        setPosicaoEixoY(this.getPosicaoEixoY()+3);
        Thread.sleep(500);
        setPosicaoEixoY(this.getPosicaoEixoY()-3);
    }


}
