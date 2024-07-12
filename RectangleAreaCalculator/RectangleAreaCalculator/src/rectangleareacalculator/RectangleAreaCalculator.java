/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleareacalculator;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        
        //**************************************************************************************//
        Scanner scanner = new Scanner(System.in);
        //**************************************************************************************//
        
        //**************************************************************************************//
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        //**************************************************************************************//
        
        //**************************************************************************************//
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create Rectangle object
        Rectangle rectangle = new Rectangle(length, width);
        
        //print output
        rectangle.calculateArea();
        //**************************************************************************************//
        
    }

}

//******************************END OF FILE*******************************************//