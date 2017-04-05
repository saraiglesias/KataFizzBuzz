/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM116
 */
public class KataFizzBuzzTest {
    
    public KataFizzBuzzTest() {
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
     * Test of main method, of class KataFizzBuzz.
     */
   
    @Test
    public void testFizzBuzzDeTresDevuelve1() {
        KataFizzBuzz fb = new KataFizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
                
             
        //(fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testFizzBuzzDedosDevuelve2() {
        KataFizzBuzz fb = new KataFizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result);
                
        
             
        //(fail("The test case is a prototype.");
    }
    
    
    
    @Test
    public void testFizzBuzzDetresDevuelveFizz() {
        KataFizzBuzz fb = new KataFizzBuzz();
        String result = fb.getFizzBuzz(9);
        assertEquals("Fizz", result);
                
        
             
        //(fail("The test case is a prototype.");
    }
    
    @Test
    public void testFizzBuzzDecincoDevuelveBuzz() {
        KataFizzBuzz fb = new KataFizzBuzz();
        String result = fb.getFizzBuzz(25);
        assertEquals("Buzz", result);
                
        
             
        //(fail("The test case is a prototype.");
    }
    
    
    
    
    
    
    
    
}
