package src.Personagem;

public class PlayerCreationError extends Exception {
    public PlayerCreationError (String errorMsg) {
        super(errorMsg);
    }
}
