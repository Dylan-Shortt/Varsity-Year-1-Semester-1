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

//used to create adn store the information in arrays to be called later on once the 
//user selects the reports option in the POE class
public class TaskReport {
  //**************************************************************************************//
    //create String arrays to Store the information
    
    //**************************************************************************************//
    //create a method to hold the number of tasks
    private int numTasks;
    //**************************************************************************************//
    
    //**************************************************************************************//
        //Developer array
    public String[] Developer_Array = new String [100];
    private int D_Array_Size = 0;
    //**************************************************************************************//
    
    //**************************************************************************************//
        //Task Name array
    public String[] TaskName_Array = new String [100];
    private int TN_Array_Size = 0;
    //**************************************************************************************//
    
    //**************************************************************************************//
        //Task ID array
    public int[] TaskID_Array = new int[100];
    private int TID_Array_Size = 0;
    //**************************************************************************************//
    
    //**************************************************************************************//
        //Duration array
    public int[] Duration_Array = new int[100];
    private int Dur_Array_Size = 0;
    //**************************************************************************************//
    
    //**************************************************************************************//
        //Status array
    public String[] Status_Array = new String [100];
    private int S_Array_Size = 0;
    //**************************************************************************************//
  //**************************************************************************************//
    
    //**************************************************************************************//
    //create constructor
    public TaskReport()
    {
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //create getter and setter methods for the numTasks
    public int getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(int numTasks) {
        this.numTasks = numTasks;
    }
    //**************************************************************************************//
    
    //create methods to add values to the arrays
    
    //**************************************************************************************//
    //add string to developer array
    public void addDeveloper(String developer) 
    {
    Developer_Array[D_Array_Size] = developer;
    
    D_Array_Size++;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //add String to task name array
    public void addTaskName(String taskName) 
    {
    TaskName_Array[TN_Array_Size] = taskName;
    
    //increase the array size by one
    TN_Array_Size++;
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //add generated ID to array
    public void addTaskID(int taskID) 
    {
    TaskID_Array[TID_Array_Size] = taskID;
    
    //increase the array size by one
    TID_Array_Size++;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //add the hour durations to array
    public void addDuration(int duration) 
    {
    Duration_Array[Dur_Array_Size] = duration;
    
    //increase the array size by one
    Dur_Array_Size++;
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //add the status to the array
    public void addStatus(String status) 
    {
    Status_Array[S_Array_Size] = status;
    
    //increase the array size by one
    S_Array_Size++;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //toString to output all data when the Status is done
    public String StatusIsDone(int numberOfTasks)
    {
        String result = "";
        
        //set heading for output
        result = "All task details for every task that is marked as Done\n";
        result += "Developer: " + "Task Names: " + "Task ID: " + "Task Duration: " + "Task Status:\n";
        
        //for loop
        for(int i = 0; i < numberOfTasks; i++)
        {
            //if the status is marked as done
            if(Status_Array[i].toString().equals("Done"))
            {
                //if true add the array information to the string
                    //developer
                result += Developer_Array[i] + ", ";
                    //task names
                result += TaskName_Array[i] + ", ";
                    //task IDs
                result += TaskID_Array[i] + ", ";
                    //task duration
                result += Duration_Array[i] + ", ";
                    //task Status
                result += Status_Array[i] + "\n";
            }
        }
        
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //find and display the class with the highest duration
    public String longestDuration(int numberOfTasks)
    {
        String result = "";
        int HighestPosition = 0;
        int highestValue = 0;
        
        //run through the array
         for(int i = 0; i < numberOfTasks; i++)
         {
             //if the value in this array is higher than the highest value
             if(Duration_Array[i] > highestValue){
                 //then 
                 HighestPosition = i;
                 highestValue = Duration_Array[i];
             }
         }
        
         result += "Developer:\n" + Developer_Array[HighestPosition] + "\n";
         result += "Longest Duration:\n" + Duration_Array[HighestPosition];
         
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //search method
    public String searchArrayTaskName(String name, int numberOfTasks)
    {
        //set headings
        String result = "Task Name: " + "Developer: " + "Task Status:\n";
        
        //search through hole array
        for(int i = 0; i < numberOfTasks; i++)
        {
            //value is equal to target
            if(TaskName_Array[i].equals(name))
            {
                //update output
                result += TaskName_Array[i] + ", " + Developer_Array[i] + ", " + Status_Array[i] + "\n";
            }
        }
        //return
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //search method
    public String searchArrayDeveloper(String developer, int numberOfTasks)
    {
        //set headings
        String result = "Task Name: " + "Task Status:\n";
        
        //search through hole array             
        for(int i = 0; i < numberOfTasks; i++)
        {
            //value is equal to target    
            if(Developer_Array[i].toString().equals(developer))
            {
                //update output
                result += TaskName_Array[i] + ", " + Status_Array[i] + "\n";
            }
        }
        //return
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //delete a task from the array
    public void removeElement(String targetName, int numberOfTasks) {
        //sets the index defualt value
    int index = -1;
    
    //runs through the array to search for the matching value
    for (int i = 0; i < numberOfTasks; i++) {
        
        String str = "Array name : " + TaskName_Array[i] + "\n";
        str += "target name : " + targetName + "\n";
        str += "Condition : " + TaskName_Array[i].equals(targetName);
        
        JOptionPane.showMessageDialog(null, str);
        
        if (TaskName_Array[i].equals(targetName)) {
            index = i;
            break;
        }
    }

    if (index != -1) 
        { // If the element was found
            for (int i = index; i < numberOfTasks - 1; i++) {
                TaskName_Array[i] = TaskName_Array[i+1];
                Developer_Array[i] = Developer_Array[i+1];
                Duration_Array[i] = Duration_Array[i+1];
                Status_Array[i] = Status_Array[i+1];
                
                //completion message on deletion
                 JOptionPane.showMessageDialog(null, "Element has been removed");
                 
                //remove one size from the array
               setNumTasks((numTasks - 1));
            }
        }
    else{
        //completion message on no deletion
                 JOptionPane.showMessageDialog(null, "Element has not been removed");
    }
    
    
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //create a full report of all the tasks
    public String reportString(int numberOfTasks)
    {
        //create heading
        String result = "Full report of all tasks:\n";
        
        //run through every array and add to string
        for (int i = 0; i < numberOfTasks; i ++)
        {
            //update result String
            result += TaskName_Array[i] + ", " 
                    + Developer_Array[i] + ", " 
                    + Duration_Array[i] + ", " 
                    + Status_Array[i] + "\n";
            
        }
        
        return result;
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//