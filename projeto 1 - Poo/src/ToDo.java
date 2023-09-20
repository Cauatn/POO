//! import java.util.ArrayList;


public class ToDo {
    private int finishedTasks; //* quantidade de tarefas terminadas */
    private int unfinishedTasks; //* quantidade de tarefas nao terminadas */
    private int tasksAmount; //* quantidade total de tarefas */

    //! ArrayList <Task> test;
    //* getters e setters */
    public int getFinishedTasks() {
        return finishedTasks;
    }
    public int getTasksAmount() {
        return tasksAmount;
    }
    public int getUnfinishedTasks() {
        return unfinishedTasks;
    }
    public void setFinishedTasks(int finishedTasks) {
        this.finishedTasks = finishedTasks;
    }
    public void setTasksAmount(int tasksAmount) {
        this.tasksAmount = tasksAmount;
    }
    public void setUnfinishedTasks(int unfinishedTasks) {
        this.unfinishedTasks = unfinishedTasks;
    }

    //*métodos */
}