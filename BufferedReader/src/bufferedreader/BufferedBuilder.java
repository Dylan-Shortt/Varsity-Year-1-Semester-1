/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreader;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dylan
 */
public class BufferedBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //**************************************************************************************//
        //create buffered reader instance
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //**************************************************************************************//

        //**************************************************************************************//
        //declarations
        StringBuilder build = new StringBuilder();
        String newInput = "";
        boolean firstInput = true; // To check if it's the first input
        //**************************************************************************************//

        //**************************************************************************************//
        //priming input
        System.out.println("\nEnter text : ");
        System.out.print(">>> ");
        //**************************************************************************************//

        //**************************************************************************************//
        //ask the user for input until they enter 'exit'
        while (!newInput.equals("exit")) {
            //call the input method to get user input
            newInput = input(br, build, firstInput);
            firstInput = false; // Set to false after the first input
        }
        //**************************************************************************************//

        //**************************************************************************************//
        //output the collected string
        System.out.print("\nComplete Text: ");
        System.out.println(build);
        //**************************************************************************************//

        //**************************************************************************************//
        try {
            //close the buffered reader
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(BufferedBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        //**************************************************************************************//
    }

    public static String input(BufferedReader br, StringBuilder build, boolean firstInput) {
        String newInput = "";
        //**************************************************************************************//
        //try to get user input and catch any errors
        try {
            //**************************************************************************************//
            //priming input
            System.out.println("\nEnter new text (exit to finish): ");
            System.out.print(">>> ");
            //**************************************************************************************//

            //**************************************************************************************//
            //read the inputted line from the user
            newInput = br.readLine();
            //**************************************************************************************//

            //**************************************************************************************//
            //add the new line to the full string
            if (!firstInput && !newInput.equals("exit")) {
                build.append(", ");
            }
            build.append(newInput);
            //**************************************************************************************//

            //**************************************************************************************//
            //check if the input was exit
            if (newInput.equals("exit")) {
                //**************************************************************************************//
                //remove the last input if it's the exit command
                int exitIndex = build.lastIndexOf(", exit");
                if (exitIndex != -1) {
                    build.delete(exitIndex, build.length());
                } else {
                    exitIndex = build.lastIndexOf("exit");
                    if (exitIndex != -1) {
                        build.delete(exitIndex, build.length());
                    }
                }
                //**************************************************************************************//
            } else {
                //**************************************************************************************//
                //print accumulated Text
                System.out.print("Accumulated Text: ");
                System.out.print(build);
                System.out.println();
                //**************************************************************************************//
            }
            //**************************************************************************************//

        }
        //**************************************************************************************//
        //catch the exception
        catch (IOException ex) {
            Logger.getLogger(BufferedBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        //**************************************************************************************//
        return newInput;
    }
}
//***********************************END OF FILE****************************************//
