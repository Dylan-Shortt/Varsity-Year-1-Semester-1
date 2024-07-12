/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
// package containing the program
package poe;   
//**************************************************************************************//
 
//**************************************************************************************//
//import the JOptionPane for user input
import javax.swing.JOptionPane; 
//**************************************************************************************//

/**
 * 
 * @author dylan
 */
//**************************************************************************************//
//main class class
public class POE {
//**************************************************************************************//

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //**************************************************************************************//
        //create register object
        Registration register = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create register object
        Task task = new Task();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create register object
        TaskReport taskReport = new TaskReport();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //greet the user
        JOptionPane.showMessageDialog(null, "Welcome user, please register with us by entering the following information with us below");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call registerUser() method to return the output messages of the registration
        String output = register.registerUser();
        
        JOptionPane.showMessageDialog(null, output);
        
        //**************************************************************************************//
        
        //**************************************************************************************//
        //get first name and surname
        String getFirstName = register.getFirstName();
        String getSurname = register.getSurname();
        //**************************************************************************************//
        
        //**************************************************************************************//
        // create a Login object and pass the Registration object to it
             Login login = new Login(register);
        //**************************************************************************************//

        //**************************************************************************************//
        //creates a boolean value to check if the login is valid
        boolean validLogin = false;
        //**************************************************************************************//

    //**************************************************************************************//
     // login window
    JOptionPane.showMessageDialog(null, "Welcome to the login screen, please enter your details below");
    //**************************************************************************************//

    //**************************************************************************************//
    //while the login variable is false, ask the user to login
    while(!validLogin) {
         //**************************************************************************************//
        // call loginUser() method to verify the login details
        validLogin = login.loginUser();
        //**************************************************************************************//

        //**************************************************************************************//
        // return login status
        String LoginStatus = login.returnLoginStatus(validLogin);
        JOptionPane.showMessageDialog(null, LoginStatus);
        //**************************************************************************************//
    }
    //**************************************************************************************//
    // Output welcome message with user's first name and surname
    JOptionPane.showMessageDialog(null, "Welcome " + getFirstName + ", " + getSurname + " it is great to see you again.");
    //**************************************************************************************//
    
    //**************************************************************************************//
    //display welcome message for EasyKanBan
    JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
    //**************************************************************************************//
     
    //**************************************************************************************//
    //Display end of program message
    JOptionPane.showMessageDialog(null, "END OF PART 1");
    //**************************************************************************************//
//**************************************************************************************////**************************************************************************************//

    //**************************************************************************************//
    //declare
    int choice = -1;
    //**************************************************************************************//
    
    //**************************************************************************************//
    //create while loop to ask the user for there choice
    while(choice != 2)
    {
        //**************************************************************************************//
        //creates a Object called options that holds the button names for the OptionDialog
        Object[] options = {"Add tasks", "Show report", "Quit"};
        //**************************************************************************************//
        
        //if this is the first time
        if(choice == -1)
        {
        //**************************************************************************************//
        //choice gets assinged the value of the button pressed
        choice = JOptionPane.showOptionDialog(null, "Choose your desired action", "Main window", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,  options[0]);
        //**************************************************************************************//
        }
        else
        {
            //if this is not the first time
            //**************************************************************************************//
            //creates a Object called options that holds the button names for the OptionDialog
            Object[] optionsSecond = {"Show report", "Quit"};
            //**************************************************************************************//
            
            //**************************************************************************************//
        //choice gets assinged the value of the button pressed
        choice = JOptionPane.showOptionDialog(null, "Choose your desired action", "Main window", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsSecond,  optionsSecond[0]);
        //**************************************************************************************//
        
            //adjust for differnece
            choice = choice + 1;
            
        }
        
        //**************************************************************************************//
        //switch Statement to act on the chosen values
        
        //**************************************************************************************//
        //create control variable
        boolean valid = false;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //defualt number of tasks
        int numTasks = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //count the number of tasks entered
        int count = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create a switch to control the users input
        switch (choice) 
        {
           //user input is zero       
    case 0:
        //**************************************************************************************//
        //display message
        JOptionPane.showMessageDialog(null, "You chose to create a task");
        //**************************************************************************************//
        
        //**************************************************************************************//
        while (valid == false)
        {
            //**************************************************************************************//
        //ask the user for number of tasks
        String numberOfTasks = JOptionPane.showInputDialog("Number of tasks to be added:");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //if user cancles input
        if(numberOfTasks == null)
        {
            cancleProgram();
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //checks if the character is a digit
        if(Character.isDigit(numberOfTasks.charAt(0)))
        {
            //**************************************************************************************//
            //sets the number of tasks
            numTasks = Integer.parseInt(numberOfTasks);
            //**************************************************************************************//
            
            //**************************************************************************************//
            // sets valid to true
            valid = true;
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        }
        //**************************************************************************************//
        //sets valid false for next loop
        valid = false;
        //**************************************************************************************//
            
        //**************************************************************************************//
        //to store the total hours
        int duration = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //Create an array to store all of the tasks to ensure they can be printed later
        String[] allTasks = new String[numTasks];
        //**************************************************************************************//
        
        //**************************************************************************************//
        // while the count value is less than the selected number of tasks
        while (count < numTasks)
    {
    //**************************************************************************************//
        //task Name
        String taskName = JOptionPane.showInputDialog("Enter the name of the task to be performed:");
    //**************************************************************************************//
    
    //**************************************************************************************//
    while(taskName.isBlank() || taskName.isEmpty())
    {
        taskName = JOptionPane.showInputDialog("Enter the name of the task to be performed:");
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
        //if user cancles input
        if(taskName == null)
        {
            cancleProgram();
        }
        //**************************************************************************************//
    
    //**************************************************************************************//
        //task number
        int taskNumber = count;
    //**************************************************************************************//
        
    //**************************************************************************************//
        //declare String taskDescription
        String taskDescription = "";
    //**************************************************************************************//
    
    //**************************************************************************************//     
        //repeat until description is valid
            //reset the control variable
            valid = false;
    //**************************************************************************************//
    
        //**************************************************************************************//
        //while valid is equal false
        while(valid == false){
            
            //**************************************************************************************//
            //task description
                taskDescription = JOptionPane.showInputDialog("Enter a short description of the task\nThis should not exceed 50 characters:");
            //**************************************************************************************//
            
            //**************************************************************************************//
            //if user cancles input
            if(taskDescription == null)
            {
                cancleProgram();
            }
            //**************************************************************************************//
         
            //**************************************************************************************//
            //test input and update control variable
            valid = task.checkTaskDescription(taskDescription);
            //**************************************************************************************//
            
            //**************************************************************************************//
            //display message 
            if (valid)
            {
                JOptionPane.showMessageDialog(null, "Task Successfully captured");
            }else
            {
            JOptionPane.showMessageDialog(null, "Task failed to capture, description must be below 50 characters");
            }
            //**************************************************************************************//
        }
        
        //**************************************************************************************//
        String developerDetails = ""; // Initialize developerDetails outside the loop

        while (developerDetails == null || developerDetails.isBlank() || developerDetails.length() < 3) 
        {   //**************************************************************************************//
            developerDetails = JOptionPane.showInputDialog("Enter the first and last name of the developer:");
            //**************************************************************************************//
            
            //**************************************************************************************//
            // Check if user cancels input
            if (developerDetails == null) {
                cancleProgram();
            }
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //enter the number of hours needed to complete the task
        String input = "";
        //**************************************************************************************//
        
        //**************************************************************************************//
        //sets hour duration to zero
        duration = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //valid set to false
        valid = false;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //while valid is false
        while (valid == false) 
        {
            //**************************************************************************************//
            //get user input
            input = JOptionPane.showInputDialog("Enter the estimated number of hours the task should take to be completed:");
            //**************************************************************************************//
            
        //**************************************************************************************//
        //if user cancles input
        if(input == null)
        {
            cancleProgram();
        }
        //**************************************************************************************//    
            
            //**************************************************************************************//
            //makes sure input is not empty
            if (input != null && !input.isEmpty() && input.chars().allMatch(Character::isDigit)) 
            {
                //**************************************************************************************//
                //sets duration
                duration += Integer.parseInt(input);
                //**************************************************************************************//
                
                //**************************************************************************************//
                //sets valid to true
                valid = true;
                //**************************************************************************************//
            } else 
            {
                //**************************************************************************************//
                //sends failed message to user if input is not a digit
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a digit.");
                //**************************************************************************************//
            }
            //**************************************************************************************//
        }
        //**************************************************************************************//
        //sets valid to false again
        valid = false;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //update total hours
        task.setTotalHours(duration);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //task ID
        String taskId = task.createTaskID(taskName, taskNumber, developerDetails);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //ask the user for task status
            //sets the button values to an array
        Object[] Statusoptions = {"To Do", "Done", "Doing"};
        //**************************************************************************************//
        
        //**************************************************************************************//
        //sets the user input with custom buttons
        int Statuschoice = JOptionPane.showOptionDialog(null, "Choose a task status", "Task Status", JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE,  null, Statusoptions, Statusoptions[0]);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //convert JOptionPane button input to String 
        String taskStatus = "" + Statusoptions[Statuschoice];
        //**************************************************************************************//
      
        //**************************************************************************************//
         //create a new String that contains all of the variables
         String allTaskInformation = "";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task name
         allTaskInformation += "Task Name: " + taskName + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add to array
         taskReport.addTaskName(taskName);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task number
         allTaskInformation += "Task Number: " + count + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add to array
         taskReport.addTaskID(count);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //create task ID
         String createdID = task.createTaskID(taskName, taskNumber, developerDetails);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add task ID
         allTaskInformation += "Task ID: " + createdID + "\n"; 
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task description
         allTaskInformation += "Task Description: " + taskDescription + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task details
         allTaskInformation += "Developer Details: " + developerDetails + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add to array
         taskReport.addDeveloper(developerDetails);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task duration
         allTaskInformation += "Task Duration: " + duration + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add to array
         taskReport.addDuration(duration);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //task Status
         allTaskInformation += "Task Status: " + taskStatus + "\n";
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add to array
         taskReport.addStatus(taskStatus);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //add the task to the array
         allTasks[count] = allTaskInformation;
         //**************************************************************************************//
         
         //**************************************************************************************//
         //display current record
         String record = task.printTaskDetails(allTasks, count);
         //***********************************************************************s***************//ss
         
         //**************************************************************************************//
         //displays the currently created record to the user
         JOptionPane.showMessageDialog(null, record, "Current record", JOptionPane.INFORMATION_MESSAGE);
         //**************************************************************************************//
         
         //**************************************************************************************//
         //increase count
            count++;
        //***********************************END OF FILE****************************************//
    }
//**************************************************************************************//
        
        //**************************************************************************************//
            //print the full task and details
        //create for loop to call of the task created into one String
        
        //**************************************************************************************//
        //declare final tasks
        String FinalTasks = "";
        //**************************************************************************************//
        
        //**************************************************************************************//
        for (int i = 0; i < numTasks; i++)
        {
            //**************************************************************************************//
            //sets the final task list
            FinalTasks += task.printTaskDetails(allTasks, i) + "\n";
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //print all tasks 
        JOptionPane.showMessageDialog(null, FinalTasks, "All Records", JOptionPane.INFORMATION_MESSAGE);
        //**************************************************************************************//
        
        //**************************************************************************************// 
        //print Total Hours
        JOptionPane.showMessageDialog(null, "Total hours needed: " + task.returnTotalHours(), "Total Hours", JOptionPane.INFORMATION_MESSAGE);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //parse the value of numTasks to the taskreport class
        taskReport.setNumTasks(numTasks);
        //**************************************************************************************//
        break;
//**************************************************************************************//        
        
//**************************************************************************************//        
    case 1:
        //**************************************************************************************//
        numTasks = taskReport.getNumTasks();
        JOptionPane.showMessageDialog(null, "You chose to Show report");
        
        //create a sutom JOptionPane Window to allow the user to chose which option they 
        //wish to be shown
        int n = -1;
        String optionsDescriptions = "";
        
        //create the display text for the Report main menu
            //formated into 'html' to give a more user friendly experience 
        optionsDescriptions += "<html>";
        optionsDescriptions += "<table>";
        optionsDescriptions += "<tr><td>Status of Done </td><td>: Display all with the status of done</td></tr>";
        optionsDescriptions += "<tr><td>Longest Duration </td><td>: Display the class with the longest duration</td></tr>";
        optionsDescriptions += "<tr><td>Search Task Name </td><td>: Search for a task by entering its task name</td></tr>";
        optionsDescriptions += "<tr><td>Search Developer </td><td>: Search all tasks by developer name</td></tr>";
        optionsDescriptions += "<tr><td>Delete by Task Name </td><td>: Delete a task using the task name</td></tr>";
        optionsDescriptions += "<tr><td>Display </td><td>: Display the full report of all the tasks</td></tr>";
        optionsDescriptions += "<tr><td>Quit </td><td>: Quit the program</td></tr>";
        optionsDescriptions += "</table>";
        optionsDescriptions += "</html>";

        
        
        //create JOptionPane in while loop until user selects quit
        
        while(n != 6)
        {
        Object[] Reportoptions = {"Status of Done", "Longest Duration", "Search Task Name", "Search Developer", "Delete", "Display", "Quit"};
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
                
                //**************************************************************************************//
                //if_ target1 is null / user cancels
                if(target1 == null)
                {
                    cancleProgram();
                }
                //**************************************************************************************//
                
                String result3 = taskReport.searchArrayTaskName(target1, numTasks);
                JOptionPane.showMessageDialog(null, result3);
                break;
                
            case 3:
                // code for Option 4
                String target2 = JOptionPane.showInputDialog(null, "which Developer are you searching for?");
                //**************************************************************************************//
                //if_ target2 is null / user cancels
                if(target2 == null)
                {
                    cancleProgram();
                }
                //**************************************************************************************//
                String result4 = taskReport.searchArrayDeveloper(target2, numTasks);
                JOptionPane.showMessageDialog(null, result4);
                
                break;
                
            case 4:
                // code for Option 5
                String target3 = JOptionPane.showInputDialog(null, "Delete task by entering the Task name");
                //**************************************************************************************//
                //if_ target3 is null / user cancels
                if(target3 == null)
                {
                    cancleProgram();
                }
                //**************************************************************************************//
                
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
            case 6:
                cancleProgram();
                break;
        }
        //**************************************************************************************//
        
        }
        //**************************************************************************************// 
        break;
//**************************************************************************************//        
        
//**************************************************************************************//        
    case 2:
        //display the end of program message
        cancleProgram();
        break;
//**************************************************************************************//        
        
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //cancle program message and action
    public static void cancleProgram()
    {
        JOptionPane.showMessageDialog(null, "You chose to quite the program");
        System.exit(0);
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//4
