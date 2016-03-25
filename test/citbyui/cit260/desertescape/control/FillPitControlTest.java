/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garrett
 */
public class FillPitControlTest {
    
    
    public FillPitControlTest() {
    }

    /**
     * Test of FillPit method, of class FillPitController.
     */
    @Test
    public void testFillPit() {
        console.println("FillPit");
        long shovelFull = 21;
        long height = 5;
        long width = 5;
        long length = 5;
        FillPitControl instance = new FillPitControl();
        long expResult = 21;
        long result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
        
        shovelFull = -1;
        height = 5;
        width = 5;
        length = 5;
        expResult = 0;
        result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
        
        shovelFull = 0;
        height = 5;
        width = 5;
        length = 5;
        expResult = 0;
        result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
        
        shovelFull = 22;
        height = 5;
        width = 5;
        length = 5;
        expResult = 0;
        result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
        
        shovelFull = 20;
        height = 5;
        width = 5;
        length = 5;
        expResult = 0;
        result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
            
        shovelFull = 167101;
        height = 100;
        width = 100;
        length = 100;
        expResult = 167101;
        result = instance.FillPit(shovelFull, height, width, length);
        assertEquals(expResult, result);
    }
    
}
