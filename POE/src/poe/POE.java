/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //**************************************************************************************//
        //create Task Object
         Task task = new Task();
        //**************************************************************************************//
         
        //**************************************************************************************//
        TaskReport taskReport = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //create register object
        Registration register = new Registration();
        //**************************************************************************************//
        
        //greet the user
        JOptionPane.showMessageDialog(null, "Welcome user, please register with us by entering the following information with us below");
        //call registerUser() method to return the output messages of the registration
        register.registerUser();
        
        //get first name and surname
        String getFirstName = register.getFirstName();
        String getSurname = register.getSurname();
        //**************************************************************************************//
        
        //**************************************************************************************//
        // create a Login object and pass the Registration object to it
    Login login = new Login(register);

    boolean validLogin = false;

    // login window
    JOptionPane.showMessageDialog(null, "Welcome to the login screen, please enter your details below");

    while(!validLogin) {
        // call loginUser() method to verify the login details
        validLogin = login.loginUser();

        // return login status
        login.returnLoginStatus(validLogin);
    }

    // output welcome message
    JOptionPane.showMessageDialog(null, "Welcome " + getFirstName + ", " + getSurname + " it is great to see you again.");
    
    //**************************************************************************************//
    
    //**************************************************************************************//
    //display welcome message
    JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
    //**************************************************************************************//
    
    //**************************************************************************************//
    //end of program message
    JOptionPane.showMessageDialog(null, "END OF PART 1");
    //**************************************************************************************//
    
    //**************************************************************************************//
    //declare
    int choice = -1;
    
    //create while loop to ask the user for there choice
    while(choice != 2)
    {
        //**************************************************************************************//
        //creates a Object called options that holds the button names for the OptionDialog
        Object[] options = {"Add tasks", "Show report", "Quit"};
        //**************************************************************************************//
        
        //**************************************************************************************//
        //choice gets assinged the value of the button pressed
        choice = JOptionPane.showOptionDialog(null, "Choose your desired action", "Main window", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,  options[0]);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //switch Statement to act on the chosen values
        
        //create control variable
        boolean valid = false;
        int numTasks = 0;
        int count = 0;
        
        switch (choice) 
        {
                  
    case 0:
        //display message
        JOptionPane.showMessageDialog(null, "You chose to create a task");
        
        
        //**************************************************************************************//
        while (valid == false)
        {
       // //ask the user for number of tasks
        String numberOfTasks = JOptionPane.showInputDialog("Number of tasks to be added:");
        
        if(Character.isDigit(numberOfTasks.charAt(0)))
        {
            numTasks = Integer.parseInt(numberOfTasks);
            valid = true;
        }
        
        }
        valid = false;
        //**************************************************************************************//
            
            
       // }
        //to store the total hours
        int duration = 0;
        
        //Create an array to store all of the tasks to ensure they can be printed later
        String[] allTasks = new String[numTasks];
        
        while (count < numTasks)
    {
    //**************************************************************************************//
        //task Name
        String taskName = JOptionPane.showInputDialog("Enter the name of the task to be performed:");
        
        //task number
        int taskNumber = count;
        
        //declare String taskDescription
        String taskDescription = "";
         
        //repeat until description is valid
            //reset the control variable
            valid = false;
        while(valid == false){
            
            //task description
         taskDescription = JOptionPane.showInputDialog("Enter a short description of the task\nThis should not exceed 50 characters:");
        
         //test input and update control variable
         valid = task.checkTaskDescription(taskDescription);
            
        }
        
        //developerDetails
        String developerDetails = JOptionPane.showInputDialog("Enter the first and last name of the developer:");
        
        //**************************************************************************************//
        //enter the number of hours needed to complete the task
        String input = "";
        duration = 0;
        valid = false;
        while (valid == false) 
        {
            input = JOptionPane.showInputDialog("Enter the estimated number of hours the task should take to be completed:");
            if (input != null && !input.isEmpty() && input.chars().allMatch(Character::isDigit)) 
            {
                duration += Integer.parseInt(input);
                valid = true;
            } else 
            {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a digit.");
            }
        }

        valid = false;
        //**************************************************************************************//
        
        
        //update total hours
        task.setTotalHours(duration);
        
        //task ID
        String taskId = task.createTaskID(taskName, taskNumber, developerDetails);
        
        //ask the user for task status
        Object[] Statusoptions = {"To Do", "Done", "Doing"};
        int Statuschoice = JOptionPane.showOptionDialog(null, "Choose a task status", "Task Status", JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE,  null, Statusoptions, Statusoptions[0]);
        
        //convert JOptionPane button input to String 
        String taskStatus = "" + Statusoptions[Statuschoice];
    //**************************************************************************************//
      
        //**************************************************************************************//
         //create a new String that contains all of the variables
         String allTaskInformation = "";
         //task name
         allTaskInformation += "Task Name: " + taskName + "\n";
         //add to array
         taskReport.addTaskName(taskName);
         
         //task number
         allTaskInformation += "Task Number: " + count + "\n";
         //add to array
         taskReport.addTaskID(count);
         
         //task description
         allTaskInformation += "Task Description: " + taskDescription + "\n";
         
         //task details
         allTaskInformation += "Developer Details: " + developerDetails + "\n";
         //add to array
         taskReport.addDeveloper(developerDetails);
         
         //task duration
         allTaskInformation += "Task Duration: " + duration + "\n";
         //add to array
         taskReport.addDuration(duration);
         
         //task Status
         allTaskInformation += "Task Status: " + taskStatus + "\n";
         //add to array
         taskReport.addStatus(taskStatus);
         //**************************************************************************************//
         
         //add the task to the array
         allTasks[count] = allTaskInformation;
         
         //display current record
         String record = task.printTaskDetails(allTasks, count);
         
         JOptionPane.showMessageDialog(null, record, "Current record", JOptionPane.INFORMATION_MESSAGE);
         
         //increase count
        count++;
        
        
    }
//**************************************************************************************//
        
        //**************************************************************************************//
            //print the full task and details
        //create for loop to call of the task created into one String
        
        //declare 
        String FinalTasks = "";
        for (int i = 0; i < numTasks; i++)
        {
            FinalTasks += task.printTaskDetails(allTasks, i) + "\n";
        }
        
        //print all tasks 
        JOptionPane.showMessageDialog(null, FinalTasks, "All Records", JOptionPane.INFORMATION_MESSAGE);
         
        //print Total Hours
        JOptionPane.showMessageDialog(null, "Total hours needed: " + task.returnTotalHours(), "Total Hours", JOptionPane.INFORMATION_MESSAGE);
        
        //parse the value of numTasks to the taskreport class
        taskReport.setNumTasks(numTasks);
        break;
//**************************************************************************************//        
        
//**************************************************************************************//        
    case 1:
        numTasks = taskReport.getNumTasks();
        JOptionPane.showMessageDialog(null, "You chose to Show report");
        
        //create a sutom JOptionPane Window to allow the user to chose which option they 
        //wish to be shown
        int n = -1;
        String optionsDescriptions = "";
        
        optionsDescriptions += "Option 1 : Display all with the status of done" + "\n";
        optionsDescriptions += "Option 2 : Display the class with the longest duration" + "\n";
        optionsDescriptions += "Option 3 : Search for a task by entering its task name" + "\n";
        optionsDescriptions += "Option 4 : Search all tasks by developer name" + "\n";
        optionsDescriptions += "Option 5 : Delete a task using the task name" + "\n";
        optionsDescriptions += "Option 6 : Display the full report of all the tasks" + "\n";
        optionsDescriptions += "Option 7 : Quit the program" + "\n";
        
        
        //create JOptionPane in while loop until user selects quit
        
        while(n != 6)
        {
        Object[] Reportoptions = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Option 6", "Quit"};
        n = JOptionPane.showOptionDialog(null,optionsDescriptions,"Custom OptionPane",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,Reportoptions,Reportoptions[0]);
        
        
        //**************************************************************************************//
        //nested switch statment
        switch (n) {
            case 0:
                // code for Option 1
                
                String result = taskReport.StatusIsDone(numTasks);
                JOptionPane.showMessageDialog(null, result);
                
                break;
                
            case 1:
                // Code for Option 2
                String result2 = taskReport.longestDuration(numTasks);
                JOptionPane.showMessageDialog(null, result2);
                break;
                
            case 2:
                // code for Option 3
                String target1 = JOptionPane.showInputDialog(null, "which task are you searching for?");
                String result3 = taskReport.searchArrayTaskName(target1, numTasks);
                JOptionPane.showMessageDialog(null, result3);
                break;
                
            case 3:
                // code for Option 4
                String target2 = JOptionPane.showInputDialog(null, "which Developer are you searching for?");
                String result4 = taskReport.searchArrayDeveloper(target2, numTasks);
                JOptionPane.showMessageDialog(null, result4);
                
                break;
                
            case 4:
                // code for Option 5
                String target3 = JOptionPane.showInputDialog(null, "Delete task by entering the Task name");
                
                //run method
                taskReport.removeElement(target3, numTasks);
                
                numTasks = taskReport.getNumTasks();
                
                //display result
                String result5 = taskReport.reportString((numTasks));
                JOptionPane.showMessageDialog(null, result5);
                
                break;
                
            case 5:
                // code for Option 6
                
                numTasks = taskReport.getNumTasks();
                
                 String result6 = taskReport.reportString(numTasks);
                JOptionPane.showMessageDialog(null, result6);
                
                break;
        }
        //**************************************************************************************//
        
        }
        break;
//**************************************************************************************//        
        
//**************************************************************************************//        
    case 2:
        JOptionPane.showMessageDialog(null, "You chose to quite the program");
        break;
//**************************************************************************************//        
        
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    
    
    //**************************************************************************************//
    
    //**************************************************************************************//
    //end of Part 1 program message
    JOptionPane.showMessageDialog(null, "END OF PROGRAM");
    //**************************************************************************************//
    }
    
}
//***********************************END OF FILE****************************************//