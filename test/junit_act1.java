/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class junit_act1 {
    
    public junit_act1() {
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     *
     * @throws CadenaNoValida
     */
        @Test
    public final void testInvertirCadena () throws CadenaNoValida {

        assertEquals("odnuM aloH", MyUtils.inverteix("Hola Mundo"));
    
    }
        @Test
        public final void testInvertirCadenanull () throws CadenaNoValida {

        assertEquals("null", MyUtils.inverteix(null));
    
    }
        @Test
    public final void testInvertirCadena_alola () throws CadenaNoValida {

        assertEquals("alolA", MyUtils.inverteix("Alola"));
    
    }
        @Test
        public final void testEdat () throws CadenaNoValida {

        assertEquals(19, MyUtils.edat(23, 12, 1996));
    
    }
        @Test
    public final void testEdat_viejuno () throws CadenaNoValida {

        assertEquals(-1, MyUtils.edat(23, 12, 1806));
    
    }
        @Test
    public final void testEdat_nuevuno () throws CadenaNoValida {

        assertEquals(-2, MyUtils.edat(23, 12, 2023));
    
    }
        @Test
    public final void testfactorial () throws CadenaNoValida {

        assertEquals(1, MyUtils.factorial(1),0);
    
    }
        @Test
        public final void testfactorialnegativo () throws CadenaNoValida {

        assertEquals(-1, MyUtils.factorial(-1),0);
    
    }
        @Test
        public final void testfactorialcuatro () throws CadenaNoValida {

        assertEquals(24, MyUtils.factorial(4),0);
    
    }
    
    
}
