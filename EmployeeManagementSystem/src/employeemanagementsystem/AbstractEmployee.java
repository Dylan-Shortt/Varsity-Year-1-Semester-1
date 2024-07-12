/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagementsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */

//**************************************************************************************//
// Interface Employee
interface Employee {
  public void work(); 
}
//**************************************************************************************//

public abstract class AbstractEmployee implements Employee{
    /**
     * @param args the command line arguments
     */
    //**************************************************************************************//
    //Variables
    protected String name;
    protected double salary;
    protected LocalDateTime hireDate;

    public AbstractEmployee(String name, double salary, LocalDateTime hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    //**************************************************************************************//

    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************//
        //enum EmployeeType
        enum EmployeeType{
          FULL_TIME, 
          PART_TIME, 
          CONTRACT;
        }
        //**************************************************************************************//
        
        //**************************************************************************************//
        //create an Employee array
        ArrayList<Employee> employeeList = new ArrayList<>();
        //**************************************************************************************//
        
        //**************************************************************************************//
        //start program 
        int count = 0;
        while(count < 3)
        {
            String name = JOptionPane.showInputDialog( null, "enter the persons name");
            double salary = Double.parseDouble(JOptionPane.showInputDialog( null, "enter the persons salary"));
            String date = JOptionPane.showInputDialog( null, "enter the persons date of hiring");

            // Specify the format of the date string
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'UTC' yyyy");

            // Parse the date string
            LocalDateTime hireDate = LocalDateTime.parse(date, formatter);
            
            String EmployeeTime = JOptionPane.showInputDialog( null, "Is the Employee?\n"
            + "FULL_TIME, PART_TIME, or CONTRACT");

            AbstractEmployee employee;
            switch (EmployeeTime) {
                case "FULL_TIME":
                    employee = new FullTimeEmployee(name, salary, hireDate);
                    break;
                case "PART_TIME":
                    employee = new PartTimeEmployee(name, salary, hireDate);
                    break;
                case "CONTRACT":
                    employee = new ContractEmployee(name, salary, hireDate);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid employee type: " + EmployeeTime);
            }

            employeeList.add(employee);
            count++;
        }
        //**************************************************************************************//
        
    }
    //**************************************************************************************//

    //**************************************************************************************//
    @Override
    public void work() {
        // ...
    }
    //**************************************************************************************//
    
}
//**************************************************************************************//
//overide work method
class FullTimeEmployee extends AbstractEmployee {
    public FullTimeEmployee(String name, double salary, LocalDateTime hireDate) {
        super(name, salary, hireDate);
    }

    //**************************************************************************************//
    @Override
    public void work() 
    {
        String str = "";
        str += name + " is working full-time.\n";
        str += "Bonus: " + (salary/10) + "\n";
        str += "Name: " + name + "\n";
        str += "Salary: " + salary + "\n";
        str += "Hire Date: " + hireDate + "\n"  + "\n";
        
        System.out.println(str);
    }
    //**************************************************************************************//
}
//**************************************************************************************//

//**************************************************************************************//
//overide work method
class PartTimeEmployee extends AbstractEmployee {
    public PartTimeEmployee(String name, double salary, LocalDateTime hireDate) {
        super(name, salary, hireDate);
    }

    //**************************************************************************************//
    @Override
    public void work() 
    {
        String str = "";
        str += name + " is working part-time.\n";
        str += "Bonus: " + (salary/10) + "\n";
        str += "Name: " + name + "\n";
        str += "Salary: " + salary + "\n";
        str += "Hire Date: " + hireDate + "\n"  + "\n";
        
        System.out.println(str);
    }
    //**************************************************************************************//
}
//**************************************************************************************//

//**************************************************************************************//
//overide work method
class ContractEmployee extends AbstractEmployee {
    public ContractEmployee(String name, double salary, LocalDateTime hireDate) {
        super(name, salary, hireDate);
    }

    //**************************************************************************************//
    @Override
    public void work() 
    {
        String str = "";
        str += name + " is working contract.\n";
        str += "Bonus: " + (salary/10) + "\n";
        str += "Name: " + name + "\n";
        str += "Salary: " + salary + "\n";
        str += "Hire Date: " + hireDate + "\n"  + "\n";
        
        System.out.println(str);
    }
    //**************************************************************************************//
}
//**************************************************************************************//

//***********************************END OF FILE****************************************//