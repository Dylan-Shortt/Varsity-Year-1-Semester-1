/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package outageguideselector;
import javax.swing.JOptionPane;

public class OutageGuideSelector{
    public static void main(String[] args){
        boolean contactServerUp = true;
        boolean vistaUp;
        boolean stormOutage;
        boolean vistaCSUp;
//
        int contactServerEntry = JOptionPane.showConfirmDialog(null,
                                 "Is the contact server up", "Please select",
                                 JOptionPane.YES_NO_OPTION);
        System.out.println("result from entry " + contactServerEntry);
        if(contactServerEntry==1) 
           contactServerUp = true;
        else
          if(contactServerEntry==0)
             contactServerUp = false; 
        /* System.out.println(contactServerUp); */
        
        if(contactServerUp == true){
            System.out.println("You selected yes");
        }
        else{
            System.out.println("selected no");
    }
}
}
