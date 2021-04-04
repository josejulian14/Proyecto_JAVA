/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entidad.Persona;
import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
public class ControladorTest {
    
    public ControladorTest() {
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
     * Test of listar method, of class Controlador.
     */
    @org.junit.Test
    public void testListar() {
        System.out.println("listar");
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Controlador.
     */
    @org.junit.Test
    public void testAgregar_0args() {
        System.out.println("Agregar");
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Controlador.
     */
    @org.junit.Test
    public void testAgregar_Persona() {
        System.out.println("Agregar");
        Persona p = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Agregar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class Controlador.
     */
    @org.junit.Test
    public void testEditar_HttpServletRequest() {
        System.out.println("Editar");
        HttpServletRequest request = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Editar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class Controlador.
     */
    @org.junit.Test
    public void testEditar_Persona() {
        System.out.println("Editar");
        Persona p = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Editar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class Controlador.
     */
    @org.junit.Test
    public void testDelete() {
        System.out.println("Delete");
        HttpServletRequest request = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Delete(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
