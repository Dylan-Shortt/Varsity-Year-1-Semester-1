/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangleareacalculator;

/**
 *
 * @author dylan
 */
public class Rectangle {
    private double Length, Width;
    
    public Rectangle(double length, double width)
    {
        Length = length;
        Width = width;
    }
    
    //**************************************************************************************//
    public void calculateArea() {
        // Original code has issues, fix and make it more object-oriented
        double result = getLength() * getWidth();
        
         //**************************************************************************************//
        System.out.println("The area of the rectangle is: " + result);
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //getter method for length
    private double getLength()
    {
        return Length;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //getter method for width
    private double getWidth()
    {
        return Width;
    }
    //**************************************************************************************//
}
//*******************************END OF FILE*******************************************//