package poe;

//**************************************************************************************//
// This class tests various methods of the Registration class.
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//**************************************************************************************//

//**************************************************************************************//
// The RegistrationTest class for testing the Registration class functionalities.
public class RegistrationTest {
    //**************************************************************************************//

    //**************************************************************************************//
    // Constructor for the RegistrationTest class.
    public RegistrationTest() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Set up the class before any test methods are run.
    @BeforeClass
    public static void setUpClass() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Tear down the class after all test methods are run.
    @AfterClass
    public static void tearDownClass() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Set up resources before each test method.
    @Before
    public void setUp() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Release resources after each test method.
    @After
    public void tearDown() {
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Test case for checking a correct username.
    @Test // Correct
    public void testCorrectCheckUserName() {
        //**************************************************************************************//
        System.out.println("checkUserName"); // Indicate the method under test.
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Define the correct expected username.
        String username = "kyl_1";
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create an instance of the Registration class and expected result.
        Registration instance = new Registration();
        boolean expResult = true;
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Get and test the result.
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Test case for checking an incorrect username.
    @Test // Incorrect
    public void testIncorrectCheckUserName() {
        System.out.println("checkUserName"); // Indicate the method under test.
        String username = "kyle!!!!!!!"; // Define an incorrect username.
        Registration instance = new Registration();
        boolean expResult = false; // Set the expected result.
        boolean result = instance.checkUserName(username); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }

    //**************************************************************************************//
    // Test case for checking a correct password complexity.
    @Test // Correct
    public void testCorrectCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity"); // Indicate the method under test.
        String password = "Ch&&sec@ke99!"; // Define a complex password.
        Registration instance = new Registration();
        boolean expResult = true; // Set the expected result.
        boolean result = instance.checkPasswordComplexity(password); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }
    
    //**************************************************************************************//
    // Test case for checking an incorrect password complexity.
    @Test // Incorrect
    public void testInCorrectCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity"); // Indicate the method under test.
        String password = "password"; // Define a weak password.
        Registration instance = new Registration();
        boolean expResult = false; // Set the expected result.
        boolean result = instance.checkPasswordComplexity(password); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }

    //**************************************************************************************//
    // Test case for checking a correct first name.
    @Test // Correct
    public void testCorrectCheckFirstName() {
        System.out.println("checkFirstName"); // Indicate the method under test.
        String firstName = "Klye"; // Define a correct first name.
        Registration instance = new Registration();
        boolean expResult = true; // Set the expected result.
        boolean result = instance.checkFirstName(firstName); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }
    
    //**************************************************************************************//
    // Test case for checking an incorrect first name.
    @Test // Incorrect
    public void testInCorrectCheckFirstName() {
        System.out.println("checkFirstName"); // Indicate the method under test.
        String firstName = ""; // Define an empty first name.
        Registration instance = new Registration();
        boolean expResult = false; // Set the expected result.
        boolean result = instance.checkFirstName(firstName); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }

    //**************************************************************************************//
    // Test case for checking a correct surname.
    @Test // Correct
    public void testCorrectCheckSurname() {
        System.out.println("checkSurname"); // Indicate the method under test.
        String surname = "Surname"; // Define a correct surname.
        Registration instance = new Registration();
        boolean expResult = true; // Set the expected result.
        boolean result = instance.checkSurname(surname); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }
    
    //**************************************************************************************//
    // Test case for checking an incorrect surname.
    @Test // Incorrect
    public void testInCorrectCheckSurname() {
        System.out.println("checkSurname"); // Indicate the method under test.
        String surname = ""; // Define an empty surname.
        Registration instance = new Registration();
        boolean expResult = false; // Set the expected result.
        boolean result = instance.checkSurname(surname); // Execute the method.
        assertEquals(expResult, result); // Assert the result.
    }

    //**************************************************************************************//
    // Test case for getting the username.
    @Test
    public void testGetUsername() {
        //**************************************************************************************//
        System.out.println("getUsername"); // Indicate the method under test.
        //**************************************************************************************//
    
        //**************************************************************************************//
        // Set up test data
        String expectedUsername = "kyl_1"; // Define an expected username.
        Registration instance = new Registration();
        instance.setUsername(expectedUsername); // Set the username in the instance.
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Retrieve the username from the instance
        String actualUsername = instance.getUsername(); // Get the username.
        //**************************************************************************************//
    
        //**************************************************************************************//
        // Compare the actual username with the expected username
        assertEquals(expectedUsername, actualUsername); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for setting the username.
    @Test
    public void testSetUsername() {
        //**************************************************************************************//
        System.out.println("setUsername"); // Indicate the method under test.
        //**************************************************************************************//
        
        //**************************************************************************************//
        String username = "kyl_1"; // Define a username.
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        instance.setUsername(username); // Set the username in the instance.
        assertEquals(username, instance.getUsername()); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for getting the password.
    @Test
    public void testGetPassword() {
        System.out.println("getPassword"); // Indicate the method under test.

        //**************************************************************************************//
        // Set up test data
        String expectedPassword = "Ch&&sec@ke99!"; // Define an expected password.
        Registration instance = new Registration();
        instance.setPassword(expectedPassword); // Set the password in the instance.
        //**************************************************************************************//

        //**************************************************************************************//
        // Retrieve the password from the instance
        String actualPassword = instance.getPassword(); // Get the password.
        //**************************************************************************************//

        //**************************************************************************************//
        // Compare the actual password with the expected password
        assertEquals(expectedPassword, actualPassword); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for setting the password.
    @Test
    public void testSetPassword() {
        //**************************************************************************************//
        System.out.println("setPassword"); // Indicate the method under test.
        //**************************************************************************************//
        
        //**************************************************************************************//
        String password = "Ch&&sec@ke99!"; // Define a password.
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        instance.setPassword(password); // Set the password in the instance.
        assertEquals(password, instance.getPassword()); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for getting the first name.
    @Test
    public void testGetFirstName() {
        //**************************************************************************************//
        System.out.println("getFirstName"); // Indicate the method under test.
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        String expResult = "Kyle"; // Define an expected first name.
        instance.setFirstName(expResult); // Set the first name in the instance.
        //**************************************************************************************//
        
        //**************************************************************************************//
        String result = instance.getFirstName(); // Get the first name.
        assertEquals(expResult, result); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for setting the first name.
    @Test
    public void testSetFirstName() {
        //**************************************************************************************//
        System.out.println("setFirstName"); // Indicate the method under test.
        //**************************************************************************************//
        
        //**************************************************************************************//
        String firstName = "Kyle"; // Define a first name.
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        instance.setFirstName(firstName); // Set the first name in the instance.
        assertEquals(firstName, instance.getFirstName()); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for setting the surname.
    @Test
    public void testSetSurname() {
        //**************************************************************************************//
        System.out.println("setSurname"); // Indicate the method under test.
        String surname = "Surname"; // Define a surname.
        //**************************************************************************************//
        
        //**************************************************************************************//
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        instance.setSurname(surname); // Set the surname in the instance.
        assertEquals(surname, instance.getSurname()); // Assert the equality.
        //**************************************************************************************//
    }

    //**************************************************************************************//
    // Test case for getting the surname.
    @Test
    public void testGetSurname() {
        //**************************************************************************************//
        System.out.println("getSurname"); // Indicate the method under test.
        Registration instance = new Registration();
        //**************************************************************************************//
        
        //**************************************************************************************//
        String expResult = "Surname"; // Define an expected surname.
        instance.setSurname(expResult); // Set the surname in the instance.
        //**************************************************************************************//
        
        //**************************************************************************************//
        String result = instance.getSurname(); // Get the surname.
        assertEquals(expResult, result); // Assert the equality.
        //**************************************************************************************//
    }
    //**************************************************************************************//
}
//**************************************************************************************//