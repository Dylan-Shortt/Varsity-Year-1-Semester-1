/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatures;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //decalare
        int value = 0;
        String input = "";
        //**************************************************************************************//
        //while loop
        while (!input.equalsIgnoreCase("exit"))
        {
            //**************************************************************************************//
         //input value
            input = JOptionPane.showInputDialog(null, "Enter a value, enter EXIT to stop");
            //**************************************************************************************//
            
            //**************************************************************************************//
            //test valid input
            boolean test = TestInput(input);
            if(test)
            {
            value = Integer.parseInt(input);
            //**************************************************************************************//
        
            //**************************************************************************************//
        //print value
            String result = Temperature(value);
            System.out.println(result);
            //**************************************************************************************//
            
            //**************************************************************************************//
            }else
            {
                JOptionPane.showMessageDialog(null, "Input must only contain integers");
            }
            //**************************************************************************************//
        }
        
        //**************************************************************************************//
        
    }
    //**************************************************************************************//
    public static boolean TestInput(String str)
    {
        boolean result = true;
        
        for (int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                result = false;
            }
        }
        
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public static String Temperature(int degrees)
    {
        //**************************************************************************************//
        //if below zero
        if (degrees < 0)
        {
            return ("The temperature is " + degrees + ", Freezing");
        }//**************************************************************************************//
        
        //**************************************************************************************//
        //if between 0 and 10
        if (degrees >= 0 && degrees <= 10)
        {
            return ("The temperature is " + degrees + ", cold");
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //if between 11 and 20
        if (degrees >= 11 && degrees <= 20)
        {
            return ("The temperature is " + degrees + ", Morderate");
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //if between 21 and 30
        if (degrees >= 21 && degrees <= 30)
        {
            return ("The temperature is " + degrees + ", Warm");
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //if above 30
        if (degrees > 30)
        {
            return ("The temperature is " + degrees + ", Hot");
        }
        //**************************************************************************************//
        return "invalid value";
    }
     //**************************************************************************************//       
    
}
//*************************************END OF FILE****************************************//