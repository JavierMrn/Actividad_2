/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFrasesPal;

import FrasesPalindromas.Validacion;
import FrasesPalindromas.Mensaje;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author GodsLayer
 */
public class ValidacionTest {
    
    public ValidacionTest() {
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
     * Test of isPalindromo method, of class Validacion.
     */
    @Test
    public void testIsPalindromo() {
        System.out.println("Metodo isPalindromo");
        Mensaje frase = new Mensaje("Ana");
        Validacion instance = new Validacion();
        boolean expResult = true;
        boolean result = instance.isPalindromo(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soloLetras method, of class Validacion.
     */
    @Test
    public void testSoloLetras() {
        System.out.println("Metodo soloLetras");
        Mensaje frase = new Mensaje("123Juan");
        Validacion instance = new Validacion();
        boolean expResult = false;
        boolean result = instance.soloLetras(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
