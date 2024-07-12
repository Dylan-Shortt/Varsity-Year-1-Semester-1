/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopping.cart;

import javax.swing.JOptionPane;
//**************************************************************************************//
/**
 *
 * @author dylan
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************************************************//
        int QItem1 = 3;
        int QItem2 = 2;
        int QItem3 = 1;
        //*************************************************************************************//
        
        //*************************************************************************************//
        double PItem1 = 25.50;
        double PItem2 = 12.75;
        double PItem3 = 30.00;
        //*************************************************************************************//
        
        //*************************************************************************************//
        double TItem1 = QItem1 * PItem1;
        double TItem2 = QItem2 * PItem2;
        double TItem3 = QItem3 * PItem3;
        //*************************************************************************************//
        
        //*************************************************************************************//
        String result = "";
        
        result += "Item 1 total cost : R" + TItem1 + "\n";
        result += "Item 2 total cost : R" + TItem2 + "\n";
        result += "Item 3 total cost : R" + TItem3 + "\n";
        
        double total = TItem1 + TItem2 + TItem3;
        result += "Total cost : R" + total;
        
        JOptionPane.showMessageDialog(null, result);
        //*************************************************************************************//
        
    }
    
}
//******************************ooo000 END OF FILE 000ooo******************************//