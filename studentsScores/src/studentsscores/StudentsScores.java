/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsscores;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class StudentsScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        int input = 0;
        //**************************************************************************************//
        //get input
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "enter value to get score, enter -1 to exit"));
        //**************************************************************************************//
        
        while(input != -1)
        {
        
        //**************************************************************************************//
        //call method to get symbol
        String symbol = mark(input);
        //**************************************************************************************//
        
        //**************************************************************************************//
        // add + sign to symbol
        boolean newSymbol = Plus(input);
        
        if (newSymbol == true)
        {
            symbol += "+";
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        // add - sign to mark
        boolean minus = Minus(input);
         if (minus == true)
        {
            symbol += "-";
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //print output
        System.out.println(symbol);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //get input
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "enter value to get score, enter -1 to exit"));
        //**************************************************************************************//
        }
    }
    
    //**************************************************************************************//
    public static boolean Minus(int symbol)
    {
        
        String value = symbol + "";
        if(value.charAt(1) == '1')
        {
            return true;
        }
        
        if(value.charAt(1) == '2')
        {
            return true;
        }
        
        if(value.charAt(1) == '3')
        {
            return true;
        }
        
        return false;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    public static boolean Plus(int symbol)
    {
        
        String value = symbol + "";
        if(value.charAt(1) == '9')
        {
            return true;
        }
        
        return false;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //method to add mark symbol
    public static String mark(int mark)
    {
        String result = "";
        
        // mark value of A
        if(mark >= 90 && mark <= 100)
        {
            result = "A";
        }
        
        // mark value of B
        if(mark >= 80 && mark <= 89)
        {
           result = "B"; 
        }
        
        // mark value of C
        if(mark >= 70 && mark <= 79)
        {
            result = "C";
        }
        
        // mark value of D
        if(mark >= 60 && mark <= 69)
        {
            result = "D";
        }
        
        // mark value of F
        if(mark < 60)
        {
            result = "F";
        }
        
        return result;
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//