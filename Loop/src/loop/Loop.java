/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loop;

import java.util.*;

/**
 *
 * @author dylan ICE TASK 1 ST10438409
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //print user instructions
        HouseKeeping();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //declare value
        int valueReturned = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //get input from user
        valueReturned = getInput();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //check value is positive
        if (valueReturned > 0)
        {
        //**************************************************************************************//
        //print result of for loop
        loopInput(valueReturned);
        //**************************************************************************************//  
        }
        else
        {
            //**************************************************************************************//
            //print error message
            System.out.println("Value was not a positive number, or value was zero");
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //end of job
        endOfJob();
        //**************************************************************************************//
       
    }
    //**************************************************************************************//
    public static void endOfJob()
    {
     //**************************************************************************************//
        //print message at end of program
        System.out.println("\nEnd Of Program");
     //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public static void loopInput(int value)
    {
        //**************************************************************************************//
        //print heading 
        System.out.println("Fibonacci Series up to " + value + " terms:");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //declare
        int num1 = 0;
        int num2 = 1;
        int num3;
        //**************************************************************************************//
        //print initial values
        
        System.out.print(num1 + " " + num2 + " ");
        //**************************************************************************************//
     
        //**************************************************************************************//
        for (int i = 0; i < (value - 2); i++)
        {
            //solve next term
            num3 = num1 + num2;
            
            //print result
            System.out.print(num3 + " ");
            
            //set next values
            num1 = num2;
            num2 = num3;
            
        }
        //**************************************************************************************//
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public static void HouseKeeping()
    {
        System.out.print ("Enter the number of terms in the Fibonacci Series: ");
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public static int getInput()
    {
        //**************************************************************************************//
        //declare
        int input = 0;
        //**************************************************************************************//
                
        //**************************************************************************************//
        // set up the scanner 
        Scanner scan = new Scanner (System.in);
        //**************************************************************************************//
        
        input = scan.nextInt();
        
        return input;
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//