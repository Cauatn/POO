package SessionConfig;

public class Session {
    private int sessionTime; //* tempo total que a sessao vai durar */
    private int sessionId; //* id da sessao, primeira sessao, segunda, terceira, etc */

    //* getters e setters */
    public void setSessionTime(int sessionTime) {
        this.sessionTime = sessionTime;
    }
    public int getSessionTime() {
        return sessionTime;
    }

    //* métodos */
}
