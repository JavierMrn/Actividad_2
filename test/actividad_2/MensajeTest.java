/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

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
public class MensajeTest {
    
    public MensajeTest() {
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
     * Test of darFormato method, of class Mensaje.
     */
    @Test
    public void testDarFormato() {
        System.out.println("Metodo darFormato");
        Mensaje instance = new Mensaje("J.A.V.I.E.R");
        instance.darFormato();
        String expResult = "javier";
        String result = instance.getFrase();
        assertArrayEquals(expResult.toCharArray(), result.toCharArray());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
