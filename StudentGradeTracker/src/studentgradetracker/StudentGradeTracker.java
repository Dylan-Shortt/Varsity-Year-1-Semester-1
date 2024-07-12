/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradetracker;

//package to create array lists
import java.util.ArrayList;

//package to call scanner
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class StudentGradeTracker {

    /**
     * @param args the command line arguments
     */
    
    //**************************************************************************************//
        //declare static arrays
        static ArrayList<String> nameArray = new ArrayList<String>();
        static ArrayList<Integer> gradeArray = new ArrayList<Integer>();
    //**************************************************************************************//
        
    //**************************************************************************************//
        //declare scanner 
        static Scanner scan = new Scanner (System.in);
    //**************************************************************************************//
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //declare array and array size
        int arraySize = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //declare variables
        boolean valid = true;
        String name = "";
        int grade = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create a while loop to repeat user input
        //call house keeping / greeting message
        HouseKeeping();
        while(valid == true)
        {
            //*******************************************//
            //create test boolean
            boolean temp = true;
            //*******************************************//
            
            //*******************************************//
            //call instructions
            Instructions();
            //*******************************************//
            
            //*******************************************//
            //get user input
            String inputValue = scan.next();
            int input = 0;
            //*******************************************//
          
          //**************************************************************************************//
          //check if input is valid
          while (temp == true)
          {
              //if the input is not a digit or is not empty
              if(!inputValue.matches("[1-5]+") || inputValue.isBlank() || inputValue.isEmpty())
              {
                 System.out.println("Error input is not a number or is not in the range of 1 to 5"); 
                 //reprints the instructions
                 Instructions();
                 //gets the entered value
                 inputValue = scan.next();
                 temp = true;
              } else
              {
                  //convert the string input into an integer
                  input = Integer.parseInt(inputValue);
                  temp = false;
              }
          }
          //**************************************************************************************//
          
          //**************************************************************************************//
          //if user enters 1
          if(input == 1)
          {
                arraySize = OptionOne(arraySize);
          }
          //**************************************************************************************//
          
          //**************************************************************************************//
          //if user enters 2
          if(input == 2)
          {
              OptionTwo(arraySize);
          }
          //**************************************************************************************//
          
        //**************************************************************************************//
          //if user enters 3
          if(input == 3)
          {
              OptionThree(arraySize);
          }
          //**************************************************************************************//
          
          //**************************************************************************************//
          //if user enters 4
          if(input == 4)
          {
              OptionFour(arraySize);
          }
          //**************************************************************************************//
          
          //**************************************************************************************//
          //if user enters 5
          if(input == 5)
          {
              endOfJob();
          }
          //**************************************************************************************//
          
        }
        scan.close();
        //**************************************************************************************//
        
        
    }
    
    
    //**************************************************************************************//
    //create first welcome message
    public static void HouseKeeping()
    {
        System.out.println("Welcome to the Student Grade Tracker!");
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //user instructions for using the program
    public static void Instructions()
    {
        //instruction message
       System.out.println("What would you like to do?");
       System.out.println("1. Add a new student and grade");
       System.out.println("2. Display list of studetns and their grades");
       System.out.println("3. Calculate average grade for the subject");
       System.out.println("4. Search for a student and display their grade");
       System.out.println("5. Exit");
       System.out.println();
       System.out.print("Enter your choice: ");
    }
    //**************************************************************************************//

    //**************************************************************************************//
    private static int OptionOne(int arraySize) {
        //**************************************************************************************//
                //ask for the users new student name
                System.out.println();
                System.out.print("Enter the name of the new student: ");
                String name = scan.next();
                //**************************************************************************************//
                
                //**************************************************************************************//
                //ask for the users new student name
                System.out.print("Enter the grade of the new student: ");
                int grade = scan.nextInt();
                //**************************************************************************************//
                
                //**************************************************************************************//
                //add new person to the array
                nameArray.add(name);
                gradeArray.add(grade);
                //**************************************************************************************//
                
                //**************************************************************************************//
                //increase array size
                arraySize++;
                System.out.println();
                //**************************************************************************************//
                return arraySize;
    }
    //**************************************************************************************//

    //**************************************************************************************//
    private static void OptionTwo(int arraySize) 
    {
            if(!nameArray.isEmpty() || !gradeArray.isEmpty())
              {
              //message
              System.out.println();
              System.out.println("List of students and there grades");
              
                //**************************************************************************************//
                //display all the students
              for (int i = 0; i < arraySize; i++)
              {
                  System.out.println((i+1) + ". " +  nameArray.get(i) + " - " + gradeArray.get(i));
              }
              //**************************************************************************************//
              System.out.println();
              }else
              {
                  System.out.println("first add a student to the array!");
              }
    }
    //**************************************************************************************//

    private static void OptionThree(int arraySize) {
        if(!nameArray.isEmpty() || !gradeArray.isEmpty())
              {
              //**************************************************************************************//
              //declare average variable
              int average = 0;
              //**************************************************************************************//
              
              //**************************************************************************************//
                //display average for the stubject
              for (int i = 0; i < arraySize; i++)
              {
                  average += gradeArray.get(i);
              }
              //**************************************************************************************//
              
              //**************************************************************************************//
              //calculate average
              average = average / arraySize;
              //**************************************************************************************//
              
              //**************************************************************************************//
              //display average
              System.out.println("The average grade of the subject is : " + average);
              System.out.println();
              //**************************************************************************************//
              
              }else
              {
                  //if the user doesn't add a student
                  System.out.println();
                  System.out.println("first add a student to the array!");
                  System.out.println();
              }
    }

    private static void OptionFour(int arraySize) {
        if(!nameArray.isEmpty() || !gradeArray.isEmpty())
              {
              //**************************************************************************************//
              //get the students name
              System.out.print("Enter the students name: ");
              String enteredName = scan.next();
              //**************************************************************************************//
              
              //**************************************************************************************//
              //find the user
              for(int i = 0; i < arraySize; i++)
              {
                  if(nameArray.get(i).equals(enteredName))
                  {
                      System.out.println(nameArray.get(i) + " has a grade value of : " + gradeArray.get(i));
                      System.out.println();
                      break;
                  }
                  
                  if(i == arraySize)
                  {
                      //the selected student was not entered
                      System.out.println("No such student is listed");
                  }
              }
             
              //**************************************************************************************//
              }else
              {
                  //if no students where entered
                  System.out.println();
                  System.out.println("first add a student to the array!");
                  System.out.println();
              }
        
    }

    //**************************************************************************************//
    private static void endOfJob() {
        //**************************************************************************************//
              //end the program
              System.out.println("Thank you for working with us !");
              System.exit(0);
              //**************************************************************************************//
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//