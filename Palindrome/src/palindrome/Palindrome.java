/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //recive input from the user
        String input = JOptionPane.showInputDialog(null, "Enter int values");
        int length = input.length() - 1;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //call method
        isPalindrome(input, length);
        //**************************************************************************************//
        
    }
     //**************************************************************************************//
    public static void isPalindrome(String input, int length)
    {
        //**************************************************************************************//
        //declare
        String returnValues = "";
        String temp = "";
        String palin = "";
        int number = Integer.parseInt(input);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //return the values of the string entered backwards
        for (int i = length; i >= 0; i--)
        {
            //assign values
            temp += input.charAt(i);
        }
        //**************************************************************************************//
        palin = temp;
        //**************************************************************************************//
        //assign value
        returnValues = temp;
        //**************************************************************************************//
        
        //check if number meets the range of an positive integer
        if( 0 <= number && number <= (Math.pow(2, 31) -1) )
        {
        
            //**************************************************************************************//
            System.out.println("input String : " + input);
            System.out.println("return value : " + palin);
            //**************************************************************************************//
        
            //**************************************************************************************//
            //check if palindrome
            if(input.equalsIgnoreCase(palin) == true)
            {
                System.out.println("It is a palindrome, " + true);
            }
            else
            {
                System.out.println("It is not a palindrome, " + false);
            }
        }
        else
        {
            System.out.println("number does not match constraints: \n0 <= number && number <= 2^31)");
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//