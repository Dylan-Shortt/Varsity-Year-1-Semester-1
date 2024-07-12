package calculatorgui;

import javax.swing.JOptionPane;

public class CalculatorGUI {

    public static void main(String[] args) {
        // TODO code application logic here

        //**************************************************************************************//
        //select the first number
        String input = JOptionPane.showInputDialog(null, "What is your first number?");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //declare invalid variable 
        boolean invalid = true;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //check that the inputed number only contains digits
        while (invalid) {
            //**************************************************************************************//
            //change value
            invalid = false;
            //**************************************************************************************//
            
            //**************************************************************************************//
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    invalid = true;
                    break;
                }
            }
            //**************************************************************************************//
            
            //**************************************************************************************//
            //if invalid, ask the user again
            if (invalid) {
                JOptionPane.showMessageDialog(null, "Invalid input, must contain only int's");
                input = JOptionPane.showInputDialog(null, "What is your first number?");
            }
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        double num1 = Double.parseDouble(input);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //sets the options for the dialog box
        Object[] options = {"Addition", "Subtraction", "Multiplication", "Division"};
        //shows the custom buttons
        int Operation = JOptionPane.showOptionDialog(null, "Choose the operation:", "Option Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //select the second number
        input = JOptionPane.showInputDialog(null, "What is your second number?");
        //**************************************************************************************//
        
        //**************************************************************************************//
        //declare invalid variable 
        invalid = true;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //check that the inputed number only contains digits
        while (invalid) {
            //**************************************************************************************//
            //change value
            invalid = false;
            //**************************************************************************************//
            
            //**************************************************************************************//
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    invalid = true;
                    break;
                }
            }
            //**************************************************************************************//
            
            //**************************************************************************************//
            //if invalid, ask the user again
            if (invalid) {
                JOptionPane.showMessageDialog(null, "Invalid input, must contain only int's");
                input = JOptionPane.showInputDialog(null, "What is your second number?");
            }
            //**************************************************************************************//
        }
        //**************************************************************************************//
        
        double num2 = Double.parseDouble(input);
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create value with primed input
        double result = 0;
        //**************************************************************************************//
        
        //**************************************************************************************//
        //switch to make use of the calculations
        switch (Operation) {
            //**************************************************************************************//
            case 0:
                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "Result : " + result);
                break;
            //**************************************************************************************//
            case 1:
                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "Result : " + result);
                break;
            //**************************************************************************************//
            case 2:
                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "Result : " + result);
                break;
            //**************************************************************************************//
            case 3:
                result = num1 / num2;
                JOptionPane.showMessageDialog(null, "Result : " + result);
                break;
            //**************************************************************************************//
        }
        //**************************************************************************************//
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//