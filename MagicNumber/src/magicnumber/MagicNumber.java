/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magicnumber;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan ICE TASK 1 ST10438409
 */
public class MagicNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "";
        
        //**************************************************************************************//
        //set value to guess
        int MagicNumber = (int) (Math.random() * 100) + 1 ;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //convert to int
        int count = 0;
        int value = -1;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //while to keep guessing value
        while (value != MagicNumber)
        {
            //**************************************************************************************//
            //houseKeeping Method
            input = HouseKeeping();
            //ask
            value = Integer.parseInt(input);
            //**************************************************************************************//
            
            //**************************************************************************************//
            //check if value is greater than MagicNumber
            if(value > MagicNumber)
            {
               JOptionPane.showMessageDialog(null, "Too high go lower!");
            }
            //**************************************************************************************//
            
            //**************************************************************************************//
            //check if value is lowerer than MagicNumber
            if(value < MagicNumber)
            {
                JOptionPane.showMessageDialog(null, "Too low go higher!");
            }
            //**************************************************************************************//
            
            //**************************************************************************************//
            //increase counter
            count ++;
            //**************************************************************************************//
            
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //end of program
        JOptionPane.showMessageDialog(null, "congratulations you guessed the number\nThe number of failed attempts was : " + count);
        //**************************************************************************************//
        
    }
    
    //**************************************************************************************//
    public static String HouseKeeping()
    {
        String enteredValue = JOptionPane.showInputDialog(null, "enter a value between 1 and 100");
        
        return enteredValue;
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//