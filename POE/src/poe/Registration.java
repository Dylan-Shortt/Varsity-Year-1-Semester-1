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
public class Registration {
    //**************************************************************************************//
    //declare variables
    private String username;
    private String password;
    private String firstName;
    private String surname;
    //**************************************************************************************//
    
    //**************************************************************************************//
    //constructor
    public Registration()
    {
        
    }
    //**************************************************************************************//
    
   //**************************************************************************************//
    //set input and output values for the class
     public void registerUser() {
         
        //**************************************************************************************//
          // Check username meets requirements
        String input;
        boolean valid = false;
        while (!valid) {
            input = JOptionPane.showInputDialog("Enter your username:");
            valid = checkUserName(input);
            if(valid) {
                setUsername(input);
                JOptionPane.showMessageDialog(null, "Username successfully captured");
            } else {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
            }
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Check password meets requirements
        valid = false;
        while (!valid) {
            input = JOptionPane.showInputDialog("Enter your Password:");
            valid = checkPasswordComplexity(input);
            if(valid) {
                setPassword(input);
                JOptionPane.showMessageDialog(null, "Password successfully captured");
            } else {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
            }
        }
        //**************************************************************************************//

        //**************************************************************************************//
        // Check first name meets requirements
        valid = false;
        while (!valid) {
            input = JOptionPane.showInputDialog("Enter your First name:");
            valid = checkFirstName(input);
            if(valid) {
                setFirstName(input);
                JOptionPane.showMessageDialog(null, "First name successfully captured");
            } else {
                JOptionPane.showMessageDialog(null, "First name must contain at least one character");
            }
        }
        //**************************************************************************************//

        //**************************************************************************************//
        // Check Surname meets requirements
        valid = false;
        while (!valid) {
            input = JOptionPane.showInputDialog("Enter your Surname:");
            valid = checkSurname(input);
            if(valid) {
                setSurname(input);
                JOptionPane.showMessageDialog(null, "Surname successfully captured");
            } else {
                JOptionPane.showMessageDialog(null, "Surname must contain at least one character");
            }
        }
        //**************************************************************************************//
    JOptionPane.showMessageDialog(null, "The two above conditions have been met and the user has been registered successfully.");
     }
   //**************************************************************************************//
     
     //**************************************************************************************//
     //check if username is valid
    public boolean checkUserName(String username)
    {
        //check if username is valid
        if(username.contains("_") && username.length() <= 5)
        {
            return true;
        }
        else{
            //return if false
        return false;
        }
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public boolean checkPasswordComplexity(String Password)
    {
       //check if password has 8 characters
        //checks if the String Password contains capital letters
        //checks if the String Password contains contains numbers
        //checks if the String Password contains contains Special characters
        if(Password.length() >= 8
                && Password.matches(".*[A-Z].*")
                && Password.matches(".*[0-9].*")
                && Password.matches(".*[^a-zA-Z0-9].*"))
        {
            return true;
        }
        else{
            return false;
        }
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //check first name contains characters
    public boolean checkFirstName(String FN)
    {
        //check if username is valid
        if(!FN.isBlank() || !FN.isEmpty())
        {
            return true;
        }
        else{
            //return if false
        return false;
        }
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //check first name contains characters
    public boolean checkSurname(String SN)
    {
        //check if username is valid
        if(!SN.isBlank() || !SN.isEmpty())
        {
            return true;
        }
        else{
            //return if false
        return false;
        }
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //getter and setter methods
    
    //**************************************************************************************//
    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //**************************************************************************************//
    
//**************************************************************************************//
    // Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Getter and setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //**************************************************************************************//
//**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//