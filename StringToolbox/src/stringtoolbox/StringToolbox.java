/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtoolbox;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dylan
 */
public class StringToolbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //**************************************************************************************//
        //declarations
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        //**************************************************************************************//
        
        //**************************************************************************************//
        //display welcome message
        HouseKeeping();
        //**************************************************************************************//
        
//**************************************************************************************//
        
        //**************************************************************************************//
        //while loop
        while (!input.equals("4"))
        {
            try {
                //**************************************************************************************//
                //display main menu
                System.out.print(mainMenu());
                //**************************************************************************************//
                
                //**************************************************************************************//
                //get user input
                input = reader.readLine();
                
                //display empty line
                System.out.println();
                //**************************************************************************************//
                
                //**************************************************************************************//
                // if user enters 1
                if(input.equals("1"))
                {
                    //get user input
                    System.out.print("Enter a String : ");
                    input = reader.readLine();
                    
                    //parse input string
                    manipulateCharacters(input);
                    
                }
                //**************************************************************************************//
                else
                {
                    //**************************************************************************************//
                // if user enters 2
                if(input.equals("2"))
                {
                    //get user input
                    System.out.print("Enter a String : ");
                    input = reader.readLine();
                    
                    //parse input string
                    stringMethods(input);
                    
                }
                else
                {
                    //**************************************************************************************//
                // if user enters 3
                if(input.equals("3"))
                {   
                    //call method
                    convertString();
                    
                }
                else
                {
                    //**************************************************************************************//
                // if user enters 4
                if(input.equals("4"))
                {
                    //end program
                    endOfProgram();
                    
                }
                else
                {
                    System.out.println("Error: input must be between 1 and 4");
                    
                }
                //**************************************************************************************//
                }
                //**************************************************************************************//
                }
                //**************************************************************************************//
                }
                
            } catch (IOException ex) {
                Logger.getLogger(StringToolbox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //close the string builder
        try {
            //**************************************************************************************//
            reader.close();
//**************************************************************************************//
        } catch (IOException ex) {
            Logger.getLogger(StringToolbox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //**************************************************************************************//
    //welcome message
    public static void HouseKeeping()
    {
        System.out.println("Welcome to StringToolBox!");
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //main menu window
    public static String mainMenu()
    {
        String output = "";
        
        output = "Menu:\n";
        output += "1. Manipulate Characters\n";
        output += "2. Apply Various String Methods\n";
        output += "3. Convert String Objects to Numbers\n";
        output += "4. Exit\n";
        output += "\n";
        output += "Enter your choice: ";
        
        return output;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //manipulateCharacters
    public static void manipulateCharacters(String input)
    {
        //**************************************************************************************//
        //Declarations
            int length = input.length();
            int middle = length/2;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //return user input
        System.out.println("Length of the String: " + length);
        System.out.println("Character at the middle index: " + input.charAt(middle));
        System.out.println();
        //**************************************************************************************//
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //stringMethods
    public static void stringMethods(String input)
    {
        try {
            //**************************************************************************************//
            //Declarations
            String search = "";
            //**************************************************************************************//
            
            //**************************************************************************************//
            //return user input
            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());
            System.out.println("Substring (2nd to 5th index): " + input.substring(2, 6));
            //**************************************************************************************//
            
            //**************************************************************************************//
            //get user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a substring to search: ");
            search = reader.readLine();
            System.out.println();
            //**************************************************************************************//
            
            //**************************************************************************************//
            //check if the original string contains the searched substring
            
            if(input.contains(search))
            {
                System.out.println("The original string contains the substring \"" + search + "\"");
            }
            else
            {
                System.out.println("The original string does not contain the substring \"" + search + "\"");
            }
            
            //**************************************************************************************//
        } catch (IOException ex) {
            Logger.getLogger(StringToolbox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //convertString
    public static void convertString()
    {
        try {
            //**************************************************************************************//
            //Declarations
            String number = "";
            int num = 0;
            //**************************************************************************************//
            
            //**************************************************************************************//
            //get user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number as a string: ");
            number = reader.readLine();
            
            num = Integer.parseInt(number);
            num = num * 2;
            
            System.out.println("Result after conversion and multiplication: " + num);
            System.out.println();
            //**************************************************************************************//
        } catch (IOException ex) {
            Logger.getLogger(StringToolbox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //**************************************************************************************//
    //Exit
    public static void endOfProgram()
    {
        //**************************************************************************************//
        //end
        System.out.println("Goodbye!");
        //**************************************************************************************//
        
        
    }
    //**************************************************************************************//
    
}
