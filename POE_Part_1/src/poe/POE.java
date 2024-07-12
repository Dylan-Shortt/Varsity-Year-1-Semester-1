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
    
    }
    
}
//***********************************END OF FILE****************************************//