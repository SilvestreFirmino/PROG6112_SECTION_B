/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog6112_section_b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SYLVESTER FIRMINO
 */
public class VillainsIT {
    
    public VillainsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of display method, of class Villains.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Villains instance = null;
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skills method, of class Villains.
     */
    @Test
    public void testSkills() {
        System.out.println("skills");
        Villains instance = null;
        instance.skills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVillainName method, of class Villains.
     */
    @Test
    public void testGetVillainName() {
        System.out.println("getVillainName");
        Villains instance = null;
        String expResult = "";
        String result = instance.getVillainName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVillainPower method, of class Villains.
     */
    @Test
    public void testGetVillainPower() {
        System.out.println("getVillainPower");
        Villains instance = null;
        String expResult = "";
        String result = instance.getVillainPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVillainSkills method, of class Villains.
     */
    @Test
    public void testGetVillainSkills() {
        System.out.println("getVillainSkills");
        Villains instance = null;
        String expResult = "";
        String result = instance.getVillainSkills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
