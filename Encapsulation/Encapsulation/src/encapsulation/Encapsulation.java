package encapsulation;
//imports the class "person" from the other package
import Classes.Person;

//creates the Class Encapsulation
public class Encapsulation {
    //creates main method
  public static void main(String[] args) {
      //*************************************************************************************//
      //creates a Object of type Person
    Person myObj = new Person();
      //*************************************************************************************//
      
      //*************************************************************************************//
      //sets the name of the object field to "John"
    myObj.setName("John"); // Set the value of the name variable to "John"
      //*************************************************************************************//
      
      //*************************************************************************************//
      //prints the name of the object to the console
    System.out.println(myObj.getName());
    //*************************************************************************************//
  }
}


//******************************END OF FILE********************************//
