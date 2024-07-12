/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************************************************//
package polymorphism;
//*************************************************************************************//

// Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

    //*************************************************************************************//
    // Method of parent class
    void Print()
    {
        // Print statement
        System.out.println("parent class");
    }
    //*************************************************************************************//
}

// Class 2
// Helper class
class subclass1 extends Parent {

    //*************************************************************************************//
    // Method
    void Print() 
    { 
        // print to the console
        System.out.println("subclass1"); 
    }
    //*************************************************************************************//
}

// Class 3
// Helper class
class subclass2 extends Parent {

    //*************************************************************************************//
    // Method
    void Print()
    {

        // Print statement
        System.out.println("subclass2");
    }
    //*************************************************************************************//
}

// Class 4
// Main class
class Polymorphism {

    //*************************************************************************************//
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
    //*************************************************************************************//
}


//**********************************END OF FILE***********************************//
