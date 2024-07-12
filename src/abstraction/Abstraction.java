package abstraction;

// Java Program to implement 
// Java Abstraction 

// Abstract Class declared 
abstract class Animal { 
    
    //*************************************************************************************//
    // Declares the variable "name" of type "String".
    // Variable can only be accessed in this class
    private String name; 
    //*************************************************************************************//
  
    //*************************************************************************************//
    // Creates the constructor "Animal" that receives the parameter "name"
    public Animal(String name) 
    {
        // Takes the "String name" parameter and saves its value to the created 
        // private variable "name"
        this.name = name; 
    } 
    //*************************************************************************************//
   
    // calls another method from a different abstract class
    public abstract void makeSound(); 
  
    //*************************************************************************************// 
    // creates a public String method called "getName()"
    public String getName() 
    { 
        // returns the name variable of the Animal class
        return name; 
    } 
    //*************************************************************************************//
} 
  
// Abstracted class 
// Dog is a child class of Animal
class Dog extends Animal { 
    
    //*************************************************************************************//
    // creates a constructor called "Dog" which receives a String parameter called "name"
    public Dog(String name) 
    { 
        // The constructor passes the variable "name" to the superclass "Animal"
        super(name); 
    } 
    //*************************************************************************************//
  
    //*************************************************************************************//
    // creates a public void method called "makeSound" which does NOT return a variable
    public void makeSound() 
    { 
        // prints to the console the "getName()" method's result plus an added String
        System.out.println(getName() + " barks"); 
    } 
    //*************************************************************************************//
} 
  
// Abstracted class 
// Class Cat extends the SuperClass Animal
class Cat extends Animal { 
    
    //*************************************************************************************//
    // the constructor receives the parameter String
    public Cat(String name) 
    {
        // Passes the variable to the SuperClass
        super(name); 
    } 
    //*************************************************************************************//
    
    //*************************************************************************************//
    // creates the method "makeSound" 
    public void makeSound() 
    { 
        // prints to the console the result of the "getName()" method and an added String
        System.out.println(getName() + " meows"); 
    } 
    //*************************************************************************************//
}

//*************************************************************************************//

// creates a public class, called Abstraction.
public class Abstraction {

    // creates the main method of the class
    public static void main(String[] args) {
        
        //*************************************************************************************//
        // creates 2 instances of the Animal class
        Animal myDog = new Dog("Buddy"); 
        Animal myCat = new Cat("Fluffy"); 
        //*************************************************************************************//
        
        //*************************************************************************************//
        // calls the makeSound() method for each class
        myDog.makeSound(); 
        myCat.makeSound();
        //*************************************************************************************//
    }
    
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//
