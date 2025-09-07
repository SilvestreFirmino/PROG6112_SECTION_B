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
public class HeroesIT {
    
    public HeroesIT() {
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
     * Test of getHeroName method, of class Heroes.
     */
    @Test
    public void testGetHeroName() {
        System.out.println("getHeroName");
        Heroes instance = null;
        String expResult = "";
        String result = instance.getHeroName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeroPower method, of class Heroes.
     */
    @Test
    public void testGetHeroPower() {
        System.out.println("getHeroPower");
        Heroes instance = null;
        String expResult = "";
        String result = instance.getHeroPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeroSkills method, of class Heroes.
     */
    @Test
    public void testGetHeroSkills() {
        System.out.println("getHeroSkills");
        Heroes instance = null;
        String expResult = "";
        String result = instance.getHeroSkills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Heroes.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Heroes instance = null;
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skills method, of class Heroes.
     */
    @Test
    public void testSkills() {
        System.out.println("skills");
        Heroes instance = null;
        instance.skills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
