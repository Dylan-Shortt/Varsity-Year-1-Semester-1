/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    //**************************************************************************************//
    // Test loginUser method for successful login
    @Test
    public void testLoginUser_Successful() {
        //**************************************************************************************//
        System.out.println("loginUser - Successful");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a mock Registration object
        Registration mockRegistration = new Registration();
        // Set the username and password for the mock registration
        mockRegistration.setUsername("testUser");
        mockRegistration.setPassword("testPassword");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a Login instance with the mock Registration object
        Login instance = new Login(mockRegistration);
        // Provide valid username and password for login
        boolean result = instance.loginUser("testUser", "testPassword");
        assertTrue(result); // Expecting successful login
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Test loginUser method for unsuccessful login
    @Test
    public void testLoginUser_Unsuccessful() {
        //**************************************************************************************//
        System.out.println("loginUser - Unsuccessful");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a mock Registration object
        Registration mockRegistration = new Registration();
        // Set the username and password for the mock registration
        mockRegistration.setUsername("testUser");
        mockRegistration.setPassword("testPassword");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a Login instance with the mock Registration object
        Login instance = new Login(mockRegistration);
        // Provide invalid username and password for login
        boolean result = instance.loginUser("invalidUser", "invalidPassword");
        assertFalse(result); // Expecting unsuccessful login
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Test returnLoginStatus method for successful login
    @Test
    public void testReturnLoginStatus_Successful() {
        //**************************************************************************************//
        System.out.println("returnLoginStatus - Successful");
        //**************************************************************************************//
        
        //**************************************************************************************//
        Registration mockRegistration = new Registration();
        // Set the username and password for the mock registration
        mockRegistration.setUsername("testUser");
        mockRegistration.setPassword("testPassword");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a Login instance with the mock Registration object
        Login instance = new Login(mockRegistration);
        String result = instance.returnLoginStatus(true);
        assertEquals("Login successful.", result); // Expecting successful login message
        //**************************************************************************************//
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    // Test returnLoginStatus method for unsuccessful login
    @Test
    public void testReturnLoginStatus_Unsuccessful() {
        //**************************************************************************************//
        Registration mockRegistration = new Registration();
        // Set the username and password for the mock registration
        mockRegistration.setUsername("testUser");
        mockRegistration.setPassword("testPassword");
        //**************************************************************************************//
        
        //**************************************************************************************//
        // Create a Login instance with the mock Registration object
        Login instance = new Login(mockRegistration);
        String result = instance.returnLoginStatus(false);
        assertEquals("Username or password incorrect, please try again.", result); // Expecting unsuccessful login message
        //**************************************************************************************//
    }
    //**************************************************************************************//
}
