package utilities;

import java.util.ArrayList;

public class ToDo {
    private ArrayList<Task> Tasks;

    private int finishedTasks;
    private int unfinishedTasks;
    private int tasksAmount;

    public static void main(String[] args) {
    }

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
}