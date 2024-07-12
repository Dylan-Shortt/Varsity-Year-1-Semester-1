/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErrorClass;

import JFrames.Login;
import JFrames.Register;


/**
 *
 * @author dylan
 */
public class ErrorChecker {
    //create register object
    Register register = new Register();
    //create login object
    Login login = new Login();
    
    //**************************************************************************************//
    //constructor
    public ErrorChecker()
    {
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public String registerUser(String username, String password, String firstName, String surname) {
        
    //**************************************************************************************//
    // Check username 
    String usernameCheck = checkUserName(username);
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Check password 
    String passwordCheck = checkPasswordComplexity(password);
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Check password 
    String firstNameCheck = ErrorRegisterFirstName(firstName);
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Check password 
    String surnameCheck = ErrorRegisterSurname(surname);
    //**************************************************************************************//

    //**************************************************************************************//
   
    // Check both username and password and return the result
    if (usernameCheck.equals("Username successfully captured") && passwordCheck.equals("Password successfully captured")
            && firstNameCheck.equals("First name successfully captured") && surnameCheck.equals("Surname successfully captured")) {
        
        return "The four above conditions have been met and the user has been registered successfully.";
    } else {
        return "Incorrectly formatted: " + usernameCheck + "\n" + passwordCheck + "\n" + firstNameCheck+ "\n" + surnameCheck;
    }
    //**************************************************************************************//
}

    //**************************************************************************************//
    
    //**************************************************************************************//
    public String checkUserName(String username)
    {
        //defines result string
        String result = "";
        
        //check if username is valid
        if(username.contains("_") && username.length() <= 5)
        {
            result = "Username successfully captured";
        }
        else{
            //return if false
        result = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        }
        
        //return result string
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public String checkPasswordComplexity(String Password)
    {
        //defines result string
        String result = "";
        boolean valid = false;
        
        //check if password has 8 characters
        //checks if the String Password contains capital letters
        //checks if the String Password contains contains numbers
        //checks if the String Password contains contains Special characters
        if(Password.length() >= 8
                && Password.matches(".*[A-Z].*")
                && Password.matches(".*[0-9].*")
                && Password.matches(".*[^a-zA-Z0-9].*"))
        {
            valid = true;
        }
        else{
            valid = false;
        }
        
        //checks the result and rerturns string
        if(valid == true)
        {
            result = "Password successfully captured";
        }
        else
        {
            result = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
        }
        
        //return result string
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //check first name contains characters
    public String ErrorRegisterFirstName(String FN)
    {
        //defines result string
        String result = "";
        
        //check if username is valid
        if(!FN.isBlank() || !FN.isEmpty())
        {
            result = "First name successfully captured";
        }
        else{
            //return if false
        result = "First name must contain at least one character";
        }
        
        //return result string
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //check first name contains characters
    public String ErrorRegisterSurname(String SN)
    {
        //defines result string
        String result = "";
        
        //check if username is valid
        if(!SN.isBlank() || !SN.isEmpty())
        {
            result = "Surname successfully captured";
        }
        else{
            //return if false
        result = "Surname must contain at least one character";
        }
        
        //return result string
        return result;
    }
    //**************************************************************************************//
    
    
    
}
