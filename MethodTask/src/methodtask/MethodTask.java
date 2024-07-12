/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodtask;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class MethodTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //**************************************************************************************//
       // set values;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number to find the product"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number to find the product"));
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call method
        int result = Product(num1, num2);
        JOptionPane.showMessageDialog(null, "The Product of " + num1 + " and " + num2 + " is equal to : " + result);
        //**************************************************************************************//
        
        //**************************************************************************************//
       // set values;
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number to find the sum"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number to find the sum"));
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call method
        double sum = Sum(num3, num4);
        JOptionPane.showMessageDialog(null, "The Sum of " + (double) num3 + " and " + (double) num4 + " is equal to : " + sum);
        //**************************************************************************************//
        
        //**************************************************************************************//
       // set values;
        String string =JOptionPane.showInputDialog(null, "Enter a String to make it upper case");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call method
        String str = toString(string);
        JOptionPane.showMessageDialog(null, "Entered String : " + string + "\n" + "Upper case : " + str);
        //**************************************************************************************//
        
        //**************************************************************************************//
       // set values;
        int num5 =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer to check if a integer is Even or Odd"));
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call method
        String words = EvenOrOdd(num5);
        JOptionPane.showMessageDialog(null, "The number " + num5 + " is " + words);
        //**************************************************************************************//
        
    }
    
    //**************************************************************************************//
    //product method
    public static int Product(int num1, int num2)
    {
        //declare the rsulte variable
        int  result = num1 * num2;
        
        //return result of calculation
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //Sum method
    public static double Sum(int num1, int num2)
    {
        //declare the rsulte variable
        double  result = num1 + num2;
        
        //return result of calculation
        return result;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //String method
    public static String toString(String str)
    {
        //declare the rsulte variable
        String string = "";
        
        for (int i = 0; i < str.length(); i++)
        {
            string += Character.toUpperCase(str.charAt(i));
        }
        
        //return result of calculation
        return string;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //product method
    public static String EvenOrOdd(int num1)
    {
        //declare the rsulte variable
        String result = "";
        
        if (num1 % 2 == 0)
        {
            result = "Even";
        }
        else{
            result = "Odd";
        }
        
        //return result of calculation
        return result;
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE**************************************//