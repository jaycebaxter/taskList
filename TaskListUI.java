
package tasklist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hezek
 */
public class TaskListUI extends javax.swing.JFrame {

    /**
     * Creates new form TaskListUI
     */
    
private ArrayList<Task> taskList = new ArrayList<>();
private int currentIndex = 0;

    public TaskListUI() {
        initComponents();
        
        // Making the task number uneditable so it always increments by 1
        taskNumberTextField.setEnabled(false);
        
             loadTasksFromFile();
             updateDisplay();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskNumberLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        taskNumberTextField = new javax.swing.JTextField();
        taskDescriptionTextField = new javax.swing.JTextField();
        deadlineLabel = new javax.swing.JLabel();
        TaskLabel = new javax.swing.JLabel();
        dateDeadlineTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        doneStatusCheckBox = new javax.swing.JCheckBox();
        saveTaskButton = new javax.swing.JButton();
        newTaskButton = new javax.swing.JButton();
        saveListButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taskNumberLabel.setText("Task Number:");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        forwardButton.setText("Forward");

        taskNumberTextField.setText("1");
        taskNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskNumberTextFieldActionPerformed(evt);
            }
        });

        taskDescriptionTextField.setText("Task Description");
        taskDescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDescriptionTextFieldActionPerformed(evt);
            }
        });

        deadlineLabel.setText("Deadline:");

        TaskLabel.setText("Task:");

        dateDeadlineTextField.setText("Deadline Date");
        dateDeadlineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDeadlineTextFieldActionPerformed(evt);
            }
        });

        statusLabel.setText("Status:");

        doneStatusCheckBox.setText("Done");
        doneStatusCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneStatusCheckBoxActionPerformed(evt);
            }
        });

        saveTaskButton.setText("Save Task");
        saveTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTaskButtonActionPerformed(evt);
            }
        });

        newTaskButton.setText("New Task");
        newTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTaskButtonActionPerformed(evt);
            }
        });

        saveListButton.setText("Save List");
        saveListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newTaskButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forwardButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusLabel)
                                .addGap(165, 165, 165)
                                .addComponent(doneStatusCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taskNumberLabel)
                                    .addComponent(TaskLabel)
                                    .addComponent(deadlineLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateDeadlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taskNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taskDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newTaskButton)
                    .addComponent(backButton)
                    .addComponent(forwardButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskNumberLabel)
                    .addComponent(taskNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskLabel)
                    .addComponent(taskDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deadlineLabel)
                    .addComponent(dateDeadlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneStatusCheckBox)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveTaskButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the back button functionality and only makes it available
     * if there is a previous task
     * @param evt backButtonActionPerformed
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    if (currentIndex > 0) {
    currentIndex--;
    updateDisplay();
    }
    forwardButton.addActionListener((ActionEvent evt1) -> {
        if (currentIndex < taskList.size() - 1) {
            currentIndex++;
            updateDisplay();
        }
    });

    }//GEN-LAST:event_backButtonActionPerformed

    private void taskNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskNumberTextFieldActionPerformed

    private void taskDescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskDescriptionTextFieldActionPerformed

    private void dateDeadlineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDeadlineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDeadlineTextFieldActionPerformed

    private void doneStatusCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneStatusCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneStatusCheckBoxActionPerformed

    /**
     * Saves the task to the array, but does not save anything to a file
     * until "save list" is pressed
     * @param evt saveTaskButtonActionPerformed
     */
    private void saveTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTaskButtonActionPerformed
        
        String deadlineInput = dateDeadlineTextField.getText();

            // Checks that the date is in YYYY-MM-DD format, returns an error alert if not
            if (!isValidDeadlineFormat(deadlineInput)) {
            JOptionPane.showMessageDialog(this, "Invalid deadline format.\nPlease use YYYY-MM-DD (e.g., 2025-04-15)\nYear range: 1950-2050");
            return;
    }

            if (!taskList.isEmpty()) {
            Task currentTask = taskList.get(currentIndex);
            currentTask.setDescription(taskDescriptionTextField.getText());
            currentTask.setDeadline(deadlineInput);
            currentTask.setDone(doneStatusCheckBox.isSelected());
            updateDisplay();
            
            JOptionPane.showMessageDialog(this, "Task saved:\n" +
                    "Task ID: " + currentTask.getTaskNumber() +
                    "\nDescription: " + currentTask.getDescription() +
                    "\nDeadline: " + currentTask.getDeadline() +
                    "\nCompleted: " + currentTask.isDone());
    }

    }//GEN-LAST:event_saveTaskButtonActionPerformed

    private void newTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTaskButtonActionPerformed

        int newTaskNumber = taskList.size() + 1;
        Task newTask = new Task(newTaskNumber, "", "", false);
        taskList.add(newTask);
        currentIndex = taskList.size() - 1;
        updateDisplay();
        taskDescriptionTextField.setText("");
        dateDeadlineTextField.setText("");
        doneStatusCheckBox.setSelected(false);
    }//GEN-LAST:event_newTaskButtonActionPerformed

    private void saveListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListButtonActionPerformed
        // TODO add your handling code here:
        saveTasksToFile();

    }//GEN-LAST:event_saveListButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TaskLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField dateDeadlineTextField;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JCheckBox doneStatusCheckBox;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton newTaskButton;
    private javax.swing.JButton saveListButton;
    private javax.swing.JButton saveTaskButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField taskDescriptionTextField;
    private javax.swing.JLabel taskNumberLabel;
    private javax.swing.JTextField taskNumberTextField;
    // End of variables declaration//GEN-END:variables

private void updateDisplay() {
    if (!taskList.isEmpty()) {
        Task currentTask = taskList.get(currentIndex);
        taskNumberTextField.setText(String.valueOf(currentTask.getTaskNumber()));
        taskDescriptionTextField.setText(currentTask.getDescription());
        dateDeadlineTextField.setText(currentTask.getDeadline());
        doneStatusCheckBox.setSelected(currentTask.isDone());

        // Disable buttons based on position
        backButton.setEnabled(currentIndex > 0);
        forwardButton.setEnabled(currentIndex < taskList.size() - 1);
        }
    }

/**
 * Saves tasks to an actual file so that they can be changed / removed / deleted
 */
private void saveTasksToFile() {
    JOptionPane.showMessageDialog(this, "Saving " + taskList.size() + " tasks to file");  // Add this line
    
    try {
        FileWriter writer = new FileWriter("tasks.txt");
        for (Task task : taskList) {
            String line = task.getTaskNumber() + "," +
                          task.getDescription().replace(",", " ") + "," +
                          task.getDeadline() + "," +
                          task.isDone();
            writer.write(line + "\n");
        }
        writer.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving tasks to file.");
    }
}

private void loadTasksFromFile() {
    try {
        File file = new File("tasks.txt");
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            taskList.clear(); 
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",", -1);
                if (parts.length == 4) {
                    int number = Integer.parseInt(parts[0]);
                    String description = parts[1];
                    String deadline = parts[2];
                    boolean isDone = Boolean.parseBoolean(parts[3]);
                    taskList.add(new Task(number, description, deadline, isDone));
                }
            }
            scanner.close();
            
            // Checks if the tasklist is empty, sets current index to
            // 0 if so, loading only 1 task
            // If there are more tasks, loads up to the last one.
            if (taskList.isEmpty()) {
                currentIndex = 0;
            }
            
            else {
                currentIndex = taskList.size() - 1;
            }
            
            updateDisplay();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading tasks from file.");
    }
}

private boolean isValidDeadlineFormat(String date) {
    if (date.matches("\\d{4}-\\d{2}-\\d{2}") == false) {
        return false;
    }
    
    try {
        
        // Splitting the date at the hyphens so I can get the year month & date
        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        
        
        // Validating that the year month and date are normal, returning
        // false in all other scenarios
        if (year > 2050 || year < 1950) {
            return false;
        }
        
        if (month > 12 || month < 1) {
            return false;
        }
        
        if (day > 31 || day < 1) {
            return false;
        }
        
        else {
            return true;
        }
    }
    
    catch (Exception e) {
        return false;
    }
}
}