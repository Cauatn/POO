package src.Items;

public class ItemCreationError extends Exception {
    public ItemCreationError (String errorMsg) {
        super(errorMsg);
    }
}
