package poe; 
//**************************************************************************************//
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//**************************************************************************************//

//**************************************************************************************//
import java.util.Arrays;
import java.util.Collection;
//**************************************************************************************//

//**************************************************************************************//
import static org.junit.Assert.assertEquals;
//**************************************************************************************//

//**************************************************************************************//
@RunWith(Parameterized.class)
public class TaskTest {
//**************************************************************************************//

    //**************************************************************************************//
    private String taskName;
    private int taskNumber;
    private String developerDetails;
    private String expectedTaskID;
    //**************************************************************************************//
    
    //**************************************************************************************//
    public TaskTest(String taskName, int taskNumber, String developerDetails, String expectedTaskID) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.developerDetails = developerDetails;
        this.expectedTaskID = expectedTaskID;
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Add Task Feature", 1, "Robyn Harrison", "AD:1:BYN"},
                {"Code Review", 0, "IKE", "CR:0:IKE"},
                {"Code Review", 1, "ARD", "CR:1:ARD"},
                {"Code Review", 2, "THA", "CR:2:THA"},
                {"Code Review", 3, "ND", "CR:3:ND"}
        });
    }
    //**************************************************************************************//

    //**************************************************************************************//
    public String createTaskID(String taskName, int taskNumber, String developerDetails) {
    String taskNameAbbreviation = taskName.substring(0, 2).toUpperCase();
    String developerInitials = developerDetails.substring(0, 3).toUpperCase();
    return taskNameAbbreviation + ":" + taskNumber + ":" + developerInitials;
}
    //**************************************************************************************//

    //**************************************************************************************//
    @Test
    public void testCorrectCheckTaskDescription() {
        String description = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    @Test
    public void testInCorrectCheckTaskDescription() {
        String description = "Create Add Task feature to add task users that has a main value and length of over 50 characters";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
    }
    //**************************************************************************************//

    //**************************************************************************************//
    @Test
    public void testSetTotalHours() {
        int duration = 10 + 12 + 55 + 11 + 1; // Login Feature
        Task instance = new Task();
        instance.setTotalHours(duration);
    }
    //**************************************************************************************//

    //**************************************************************************************//
    @Test
    public void testReturnTotalHours() {
        Task instance = new Task();
        int expResult = 10 + 12 + 55 + 11 + 1; // Login Feature
        int duration = 10 + 12 + 55 + 11 + 1; // Login Feature
        instance.setTotalHours(duration);
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
    }
    //**************************************************************************************//
}
//***********************************END OF FILE****************************************//