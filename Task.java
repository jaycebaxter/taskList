package tasklist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hezek
 */
public class Task {
    
    private int taskNumber;
    private String description;
    private String deadline;
    private boolean isDone;

    public Task(int taskNumber, String description, String deadline, boolean isDone) {
        this.taskNumber = taskNumber;
        this.description = description;
        this.deadline = deadline;
        this.isDone = isDone;
    
    }

    public int getTaskNumber() { return taskNumber; }
    public void setTaskNumber(int taskNumber) { this.taskNumber = taskNumber; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }

    public boolean isDone() { return isDone; }
    public void setDone(boolean done) { isDone = done; }
    
}
