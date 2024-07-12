/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorsandmethods;
import Classes.Shapes;
/**
 *
 * @author dylan
 */
public class ConstructorsAndMethods {
    static int CValue = 10;
    static int MValue = 5;
    static int rabbitAge = 25;
    static int TRadius = 150;
    static int C2Value = 23;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shapes shp = new Shapes(CValue);
        
        shp.circle(MValue);
        
        shp.circle(MValue, rabbitAge);
        
        shp.Triangle(TRadius);
        
        Shapes barnie = new Shapes(CValue,C2Value);
        
    }
    
}
