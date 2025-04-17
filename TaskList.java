/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasklist;

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
 * TaskList class
 */
public class TaskList {

    /**
     * Main method
     * @param args arguments
     */
    public static void main(String[] args) {
      
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TaskListUI().setVisible(true);
            }
        });
    }
    
}
