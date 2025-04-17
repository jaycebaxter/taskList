package tasklist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Program:             TaskList.java
 * Date:                April 17, 2025
 * @Author:             Hezekiah Cua and Jayce Baxter
 * Description:         A simple Task list app made using Java and Swing
 *                      This program lets users load tasks from a file,
 *                      view them one by one, edit them, and add new ones,
 *                      and save everything back to the file.
 */     

/**
 * Task class
 */
public class Task {
    
    // Declaring variables
    private int taskNumber;
    private String description;
    private String deadline;
    private boolean isDone;

    /**
     * Task constructor
     * @param taskNumber task number / ID
     * @param description task description
     * @param deadline task deadline
     * @param isDone is the task complete
     */
    public Task(int taskNumber, String description, String deadline, boolean isDone) {
        this.taskNumber = taskNumber;
        this.description = description;
        this.deadline = deadline;
        this.isDone = isDone;
    
    }

    /**
     * Getter for task number / ID
     * @return taskNumber
     */
    public int getTaskNumber() { return taskNumber; }
    
    /**
     * Setter for task number / ID
     * @param taskNumber
     */
    public void setTaskNumber(int taskNumber) { this.taskNumber = taskNumber; }

    
    /**
     * Getter for task description
     * @return description
     */
    public String getDescription() { return description; }
    
    /**
     * Setter for task description
     * @param description
     */
    public void setDescription(String description) { this.description = description; }

    /**
     * Getter for task deadline
     * @return deadline
     */
    public String getDeadline() { return deadline; }
    
    /**
     * Setter for task deadline
     * @param deadline
     */
    public void setDeadline(String deadline) { this.deadline = deadline; }

    /**
     * Getter for the checkbox determining if the task is completed
     * @return isDone
     */
    public boolean isDone() { return isDone; }
    
    /**
     * Setter for the checkbox determining if the task is completed
     * @param done 
     */
    public void setDone(boolean done) { isDone = done; }
    
}
