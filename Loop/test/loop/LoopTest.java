/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loop;

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
public class LoopTest {
    
    public LoopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Loop.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loop.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfJob method, of class Loop.
     */
    @Test
    public void testEndOfJob() {
        System.out.println("endOfJob");
        Loop.endOfJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loopInput method, of class Loop.
     */
    @Test
    public void testLoopInput() {
        System.out.println("loopInput");
        int value = 0;
        Loop.loopInput(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HouseKeeping method, of class Loop.
     */
    @Test
    public void testHouseKeeping() {
        System.out.println("HouseKeeping");
        Loop.HouseKeeping();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class Loop.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        int expResult = 0;
        int result = Loop.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
