package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylan
 */
public class WorkerClass {
    String Name = "";
    public WorkerClass(String name)
    {
        Name = name;
    }
    
    public String toString()
    {
        String str = "";
        
        str += "Your name was : " + Name + "\n";
        
        str += "Your name has " + Name.length() + " many characters";
        
        return str;
    }
}
