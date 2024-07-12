/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

//creates the class Vehicle
class Vehicle {
    //*************************************************************************************//
    //creates a protected variable "brand" which can only be accessed in this class, and child classes
    protected String brand = "Ford";        // Vehicle attribute
    //*************************************************************************************//
  
    //*************************************************************************************//
    //creates a public method "honk()" which does not return a value
    public void honk() {                    // Vehicle method
        //prints to the console
        System.out.println("Tuut, tuut!");
    }
    //*************************************************************************************//
}

//creates a new class as an extension of the Vehicle class
public class Inheritance extends Vehicle {
    //*************************************************************************************//
    //Creates a private String "modelName" 
    private String modelName = "Mustang";    // Car attribute
    //*************************************************************************************//
  
    //*************************************************************************************//
    //creates the class's main method
    public static void main(String[] args) {

        //*************************************************************************************//
        // Create a myCar object
        Inheritance myCar = new Inheritance();
        //*************************************************************************************//

        //*************************************************************************************//
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        //*************************************************************************************//

        //*************************************************************************************//
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
        //*************************************************************************************//
    }
    //*************************************************************************************//
}

//**************************END OF FILE************************************//
