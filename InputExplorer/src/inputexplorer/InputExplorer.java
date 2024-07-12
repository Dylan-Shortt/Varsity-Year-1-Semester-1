/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputexplorer;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author dylan
 */
public class InputExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //String input for user name
        String name = JOptionPane.showInputDialog(null, "Hello User, Please enter your name below...");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //Enter user age and parse the String into a integer
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Hello User, Please enter your age below..."));
        //**************************************************************************************//
        
        //**************************************************************************************//
        //Parse the String result into a double variable
        double FavNum = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your favorite number !"));
        //**************************************************************************************//
        
        //**************************************************************************************//
        //import SwingUtilities to make sure the GUI shows up correctly 
        // set the value;
        int enjoy = 2;
        
        //repeat the loop incase of "Cancle button
        boolean value = false;
       while (enjoy == 2)
       {
        
            //receive the user input
            enjoy = JOptionPane.showConfirmDialog(null, "Do you enjoy programming?");
        
         //Pass the vaiable to the correct boolean value
          
          if(enjoy == 0)
         {
             value = true;
         }
         else 
         {
                value = false;
         }
       }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create string
        String str = "";
        
        str += "Name: " + name +  "\n";
        str += "Age: " + age  +  "\n";
        str += "Favorite number: " + FavNum  +  "\n";
        
        if(value)
        {
        str += "I enjoy programming!";
        }
        else
        {
            str += "I do not enjoy programming!";
        }
        
        //display information
        JOptionPane.showMessageDialog(null, str);
        //**************************************************************************************//
        
    }
    
}
//*******************************************END OF FILE**********************************************//