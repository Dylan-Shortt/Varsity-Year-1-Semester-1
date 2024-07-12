/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class Task {
    private int totalHours = 0;
    
    //**************************************************************************************//
    //constructor
    public Task()
    {
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //check the task description
    public boolean checkTaskDescription(String description) 
    {
        //check the length of the task description
        if (description.length() <= 50) 
        {
            //displays if the length is less than 50 characters
            JOptionPane.showMessageDialog(null, "Task Successfully captured");
            return true;
        } else 
        {
            //displays if the task is over 50 characters
            JOptionPane.showMessageDialog(null, "Task failed to capture, description must be below 50 characters");
            return false;
        }
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //creates the task ID by manipulating the entered values
    public String createTaskID(String taskName, int taskNumber, String developerDetails)
    {
       //create task ID
        //the first two digits of the task name
        String ID = "" + taskName.charAt(0)+ taskName.charAt(1);
        
        //adds a ':' 
        ID += ":";
        
        //adds the task number
        ID += taskNumber;
        
        //adds second ':'
        ID += ":";
        
        //gets the String Length
        int length = developerDetails.length() - 1;
        
        //gets the Last three digits and makes them capitals
        
        String third = "" + developerDetails.charAt(length-3);
        String second = "" + developerDetails.charAt(length-2);
        String first = "" + developerDetails.charAt(length-1);
        
        //final concatenation
        ID += third.toUpperCase() + second.toUpperCase() + first.toUpperCase();
                
        //return ID
                return ID;
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //returns all details of task
    public String printTaskDetails(String array[], int size)
    {
        String Tasks = "";
        Tasks = array[size];
        return Tasks;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //return total hours
    public void setTotalHours(int duration)
    {
        totalHours += duration;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //return total hours
    public int returnTotalHours()
    {
        return totalHours;
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//