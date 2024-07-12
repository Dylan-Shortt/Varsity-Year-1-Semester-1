/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terminology;
import Classes.WorkerClass;
import java.util.Scanner;

public class Terminology {

    public static void main(String[] args) {
        // TODO code application logic here
        //*************************************************************************************//
        System.out.println("Hello world!");
        System.out.println("Enter your name:");
        //*************************************************************************************//
        
        //*************************************************************************************//
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Bye!");
        System.out.println("*********************************");
        //*************************************************************************************//
        
        //*************************************************************************************//
        WorkerClass worker = new WorkerClass(name);
        
        System.out.println(worker.toString());
        //*************************************************************************************//
      
      
    }
    
}
//******************************ooo000 END OF FILE 000ooo******************************//