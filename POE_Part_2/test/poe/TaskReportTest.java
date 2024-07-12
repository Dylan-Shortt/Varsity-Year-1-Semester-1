package poe; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
/**
 *
 * @author dylan
 */
public class TaskReportTest {

    //**************************************************************************************//
    //method head line
    public TaskReportTest() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //method head line
    @BeforeClass
    public static void setUpClass() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //dear down
    @AfterClass
    public static void tearDownClass() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //set up
    @Before
    public void setUp() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    //down
    @After
    public void tearDown() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of getNumTasks method, of class TaskReport.
     */
    @Test
    public void testGetNumTasks() {

        //**************************************************************************************//
        //method name
        System.out.println("getNumTasks");
        //**************************************************************************************//

        //**************************************************************************************//
        //create instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //results
        int expResult = 2; // Number of tasks in the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //set 5 tasks
        int numTasks = 2;
        instance.setNumTasks(numTasks);
        //**************************************************************************************//

        //**************************************************************************************//
        //test program
        int result = instance.getNumTasks();
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of setNumTasks method, of class TaskReport.
     */
    @Test
    public void testSetNumTasks() {
        //**************************************************************************************//
        //method name
        System.out.println("setNumTasks");
        //**************************************************************************************//

        //**************************************************************************************//
        //set the numebr of tasks
        int numTasks = 2; // Number of tasks in the test data
        TaskReport instance = new TaskReport();
        instance.setNumTasks(numTasks);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of addDeveloper method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testAddDeveloper() {
        //**************************************************************************************//
        //method name
        System.out.println("addDeveloper");
        //**************************************************************************************//

        //**************************************************************************************//
        //add developer name
        String developer = "Robyn Harrison";
        TaskReport instance = new TaskReport();
        instance.addDeveloper(developer);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of addTaskName method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testAddTaskName() {
        //**************************************************************************************//
        //print method name
        System.out.println("addTaskName");
        //**************************************************************************************//

        //**************************************************************************************//
        //set the task name
        String taskName = "Login Feature"; // Task Name from the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //save the task name
        TaskReport instance = new TaskReport();
        instance.addTaskName(taskName);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of addTaskID method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testAddTaskID() {
        //**************************************************************************************//
        //print method name
        System.out.println("addTaskID");
        //**************************************************************************************//

        //**************************************************************************************//
        //set the task ID
        int taskID = 1; // Task ID from the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //save the new task id
        TaskReport instance = new TaskReport();
        instance.addTaskID(taskID);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of addDuration method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testAddDuration() {
        //**************************************************************************************//
        //print method name
        System.out.println("addDuration");
        //**************************************************************************************//

        //**************************************************************************************//
        //set the duration
        int duration = 8; // Duration from the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //add the duration
        TaskReport instance = new TaskReport();
        instance.addDuration(duration);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of addStatus method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testAddStatus() {
        //**************************************************************************************//
        //print method name
        System.out.println("addStatus");
        //**************************************************************************************//

        //**************************************************************************************//
        //add status
        String status = "To Do"; // Task Status from the test data
        TaskReport instance = new TaskReport();
        instance.addStatus(status);
        //**************************************************************************************//
    }
    //*****************************************************************//

    //**************************************************************************************//
    /**
     * Test of StatusIsDone method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testStatusIsDone() {
        //**************************************************************************************//
        //print method name
        System.out.println("StatusIsDone");
        //**************************************************************************************//

        //**************************************************************************************//
        //number of tasks
        int numberOfTasks = 1;
        //**************************************************************************************//

        //**************************************************************************************//
        //create instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //set heading for output
        String expResult = "";
        expResult = "All task details for every task that is marked as Done\n";
        expResult += "Developer: " + "Task Names: " + "Task ID: " + "Task Duration: " + "Task Status:\n";
        expResult +="No task was marked as done."; // Data from the test set
        //**************************************************************************************//

        //**************************************************************************************//
        //populate result
        instance.addDeveloper("Robyn Harrison");
        instance.addTaskName("Login Feature");
        instance.addTaskID(1);
        instance.addDuration(8);
        instance.addStatus("To Do");

        //get result
        String result = instance.StatusIsDone(numberOfTasks);
        //**************************************************************************************//

        //**************************************************************************************//
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of longestDuration method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testLongestDuration() {
        //**************************************************************************************//
        //print method name
        System.out.println("longestDuration");
        //**************************************************************************************//

        //**************************************************************************************//
        //set number of tasks
        int numberOfTasks = 2; // Number of tasks in the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //create an instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //get results
        String expResult = "";

        expResult += "Developer:\n" + "Mike Smith" + "\n";
        expResult += "Longest Duration:\n" + "10";

        //**************************************************************************************//
        // result += "Developer:\n" + Developer_Array[HighestPosition] + "\n";
        // result += "Longest Duration:\n" + Duration_Array[HighestPosition];
        //**************************************************************************************//

        //populate with durations
        instance.addDuration(8); // Duration from the test data
        instance.addDuration(10); // Duration from the test data

        //add developers
        instance.addDeveloper("Robyn Harrison"); // Developer from the test data
        instance.addDeveloper("Mike Smith"); // Developer from the test data

        //get result
        String result = instance.longestDuration(numberOfTasks);
        //**************************************************************************************//

        //**************************************************************************************//
        //test value
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of searchArrayTaskName method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testSearchArrayTaskName() {
        //**************************************************************************************//
        //print method name
        System.out.println("searchArrayTaskName");
        //**************************************************************************************//

        //**************************************************************************************//
        //name value
        String name = "Add Task Feature"; // Task Name from the test data
        int numberOfTasks = 2; // Number of tasks in the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //create an instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //expected output
        String expResult = "Task Name: " + "Developer: " + "Task Status:\n";
        expResult += "Add Task Feature, Mike Smith, Doing" + "\n"; // Data from the test set

        //populate with values
        //result += TaskName_Array[i] + ", " + Developer_Array[i] + ", " + Status_Array[i] + "\n";

        //add task names
        instance.addTaskName("Login Feature"); // Task Name from the test data
        instance.addTaskName("Add Task Feature"); // Task Name from the test data
        instance.addTaskName("Test Name 3");

        //add developers
        instance.addDeveloper("Robyn Harrison"); // Developer from the test data
        instance.addDeveloper("Mike Smith"); // Developer from the test data
        instance.addDeveloper("Test Developer 3");

        //add status's
        instance.addStatus("To Do"); // Task Status from the test data
        instance.addStatus("Doing"); // Task Status from the test data
        instance.addStatus("To Do");

        //get result
        String result = instance.searchArrayTaskName(name, numberOfTasks);
        //**************************************************************************************//

        //**************************************************************************************//
        //test
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of searchArrayDeveloper method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testSearchArrayDeveloper() {
        //**************************************************************************************//
        //print method name
        System.out.println("searchArrayDeveloper");
        //**************************************************************************************//

        //**************************************************************************************//
        //set developer
        String developer = "Robyn Harrison"; // Developer from the test data
        int numberOfTasks = 2; // Number of tasks in the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //create an instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //get and test results
        //result += TaskName_Array[i] + ", " + Status_Array[i] + "\n";
        String expResult = "Task Name: " + "Task Status:\n";
        expResult += "Login Feature, To Do" + "\n"; // Data from the test set

        //populate arrays
        //add task names
        instance.addTaskName("Login Feature"); // Task Name from the test data
        instance.addTaskName("Add Task Feature"); // Task Name from the test data
        instance.addTaskName("Test Name 3");

        //add developers
        instance.addDeveloper("Robyn Harrison"); // Developer from the test data
        instance.addDeveloper("Mike Smith"); // Developer from the test data
        instance.addDeveloper("Test Developer 3");

        //add status's
        instance.addStatus("To Do"); // Task Status from the test data
        instance.addStatus("Doing"); // Task Status from the test data
        instance.addStatus("To Do");
        //**************************************************************************************//

        //**************************************************************************************//
        //get and test results
        String result = instance.searchArrayDeveloper(developer, numberOfTasks);
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of removeElement method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testRemoveElement() {
        //**************************************************************************************//
        //print methdo name
        System.out.println("removeElement");
        //**************************************************************************************//

        //**************************************************************************************//
        //set element name to be removed
        String targetName = "Add Task Feature"; // Task Name from the test data
        int numberOfTasks = 2; // Number of tasks in the test data
        //**************************************************************************************//

        //**************************************************************************************//
        //create and instance
        TaskReport instance = new TaskReport();
        //**************************************************************************************//

        //**************************************************************************************//
        //populate arrays
        //add task names
        instance.addTaskName("Login Feature"); // Task Name from the test data
        instance.addTaskName("Add Task Feature"); // Task Name from the test data
        instance.addTaskName("Test Name 3");

        //add developers
        instance.addDeveloper("Robyn Harrison"); // Developer from the test data
        instance.addDeveloper("Mike Smith"); // Developer from the test data
        instance.addDeveloper("Test Developer 3");

        //add status's
        instance.addStatus("To Do"); // Task Status from the test data
        instance.addStatus("Doing"); // Task Status from the test data
        instance.addStatus("To Do");
        //**************************************************************************************//

        //**************************************************************************************//
        //remove element
        instance.removeElement(targetName, numberOfTasks);
        //**************************************************************************************//
    }
    //**************************************************************************************//

    //**************************************************************************************//
    /**
     * Test of reportString method, of class TaskReport.
     */
    @Test
    //**************************************************************************************//
    //method name
    public void testReportString() {
        //**************************************************************************************//
        //print method name
        System.out.println("reportString");
        //**************************************************************************************//

        //**************************************************************************************//
        //populate arrays
        int numberOfTasks = 3; // Number of tasks in the test data
        TaskReport instance = new TaskReport();
        //add task names
        instance.addTaskName("Login Feature"); // Task Name from the test data
        instance.addTaskName("Add Task Feature"); // Task Name from the test data
        instance.addTaskName("Test Name 3");

        //add developers
        instance.addDeveloper("Robyn Harrison"); // Developer from the test data
        instance.addDeveloper("Mike Smith"); // Developer from the test data
        instance.addDeveloper("Test Developer 3");

        //add status's
        instance.addStatus("To Do"); // Task Status from the test data
        instance.addStatus("Done"); // Task Status from the test data
        instance.addStatus("Doing");

        //add duration
        instance.addDuration(8); // Duration from the test data
        instance.addDuration(10); // Duration from the test data
        instance.addDuration(5);
        //**************************************************************************************//

        //**************************************************************************************//
        //expResult layout
        //result += TaskName_Array[i] + ", " + Developer_Array[i] + ", "  + Duration_Array[i] + ", "  + Status_Array[i] + "\n";

        //get results
        String expResult = "Full report of all tasks:\n";
        expResult += "Login Feature, Robyn Harrison, 8, To Do\n"; // Data from the test set
        expResult += "Add Task Feature, Mike Smith, 10, Done\n"; // Data from the test set
        expResult += "Test Name 3, Test Developer 3, 5, Doing\n";

        String result = instance.reportString(numberOfTasks);
        //**************************************************************************************//

        //**************************************************************************************//
        //test results
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//

}
//***********************************END OF FILE****************************************//
