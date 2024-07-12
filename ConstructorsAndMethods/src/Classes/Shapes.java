/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author dylan
 */
public class Shapes {
    
    
    // Shapes constructor
    public Shapes(int myValue)
    {
        System.out.println("This is a constructor : " + myValue);
    }
    
    public Shapes(int myValue, int OtherValue)
    {
        System.out.println("This is a constructor : " + myValue);
        System.out.println("This is a constructors new value : " + OtherValue);
    }
    
    public static void circle(int myValue)
    {
        System.out.println("This is a method : " + myValue);
    }
    
    public static void circle(int myValue, int AdditiontalValue)
    {
        int Total = myValue - AdditiontalValue;
        System.out.println("This is a method Overloading : " + Total);
    }
    
    public static void Triangle(int myValue)
    {
        int Radius = myValue;
        System.out.println("This is my triangle radius : " + Radius);
    }
    
}
