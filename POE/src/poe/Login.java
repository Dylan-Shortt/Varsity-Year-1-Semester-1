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
public class Login {
    
    //**************************************************************************************//
        //create register object
        Registration register = new Registration();
    //**************************************************************************************//
    
    //**************************************************************************************//
    // create constructor to receive Registration object
    public Login(Registration register) {
        this.register = register;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public boolean loginUser()
    {
        //**************************************************************************************//

        //get user input
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //check values
        if(username.equals(register.getUsername()) && password.equals(register.getPassword()))
        {
            return true;
        }else
        {
        return false;
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    
    //**************************************************************************************//
    //returns the message of weather the login was a match to the register info or not
    public void returnLoginStatus(boolean status) {
        //check if login was successful
    if (status) 
    {
        JOptionPane.showMessageDialog(null, "Login successful.");
    }else 
    {
        JOptionPane.showMessageDialog(null, "Login failed.");
    }
}//**************************************************************************************//
}
//***********************************END OF FILE****************************************//