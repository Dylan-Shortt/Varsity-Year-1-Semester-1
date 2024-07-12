/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
//package containing the program
package poe;   
//**************************************************************************************//

//**************************************************************************************// 
//import JOptionPane to get user input
import javax.swing.JOptionPane;
//**************************************************************************************//  
/** 
 *
 * @author dylan
 */
//**************************************************************************************//
//main class call line
public class Login {
//**************************************************************************************//
    
    //**************************************************************************************//
        //create register object
        Registration register = new Registration();
    //**************************************************************************************//
    
    //**************************************************************************************//
    // create constructor to receive Registration object
    public Login(Registration register) {
            //**************************************************************************************//
        //add the called arugument to the variable
        this.register = register;
            //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //method to get the login user information
    public boolean loginUser()
    {
        //**************************************************************************************//
        //declare variables
        String username = "";
        String password = "";
        //**************************************************************************************//
        
        do{
        //**************************************************************************************//
        //get user input
        username = JOptionPane.showInputDialog("Enter your username:");
        password = JOptionPane.showInputDialog("Enter your password:");
        //**************************************************************************************//
        
        //error mesage
         if (username == null || password == null) {
            cancleProgram();
         }
        }
        
        //**************************************************************************************//
        //while the user does not cancel the input window
        while (username == null || password == null);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //check values of login details
        if(username.equals(register.getUsername()) && password.equals(register.getPassword()))
        {
                //**************************************************************************************//
            //return true variable
            return true;
                //**************************************************************************************//
            //if the details don't match
        }else
        {
                //**************************************************************************************//
            //return false if the variables don't match
            return false;
                //**************************************************************************************//
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //method to test the loginUser method
    public boolean loginUser(String username, String password) {
        //check values of login details
        if (username.equals(register.getUsername()) && password.equals(register.getPassword())) {
            //return true
            return true;
        } else {
            //return false
            return false;
        }
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //returns the message of weather the login was a match to the register info or not
    public String returnLoginStatus(boolean status) {
    //**************************************************************************************//
        //String out put
        String output = "";
    //check if login was successful
    if (status) 
    {
        //**************************************************************************************//
        //return login message
        output =  "Login successful.";
        //**************************************************************************************//
    }else 
    {
        //**************************************************************************************//
        //return login message
        output = "Username or password incorrect, please try again.";
        //**************************************************************************************//
    }
    //**************************************************************************************//
    return output;
    }//**************************************************************************************//
    
    //**************************************************************************************//
    //cancle program message and action
    public static void cancleProgram()
    {
        JOptionPane.showMessageDialog(null, "You chose to quite the program");
        System.exit(0);
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//