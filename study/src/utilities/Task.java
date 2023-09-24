package utilities;

public class Task {
    private String title;
    private boolean taskStatus;
    private int priority;
    
    //*getters e setters
    public void setStatus (boolean status) {
        this.taskStatus = status;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public void setPriority (int priority) {
        this.priority = priority;
    }
    public String getTitle() {
        return title;
    }
    public int getPriority() {
        return priority;
    }
    public boolean getTaskStatus () {
        return (this.taskStatus);
    }

    //*métodos
    public void changeTitle (String title) {
        this.setTitle(title);
    }
    public void changeStatusFinished () {
        this.setStatus(true); //* tarefa completa */
    }
    public void changeStatusUnfinished () {
        this.setStatus(false);
    }
    //* Prioridade? */
}
