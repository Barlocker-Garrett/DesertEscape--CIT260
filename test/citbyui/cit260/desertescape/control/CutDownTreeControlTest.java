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
 * @author doozi
 */
public class CutDownTreeControlTest {
    
    /**
     *
     */
    public CutDownTreeControlTest() {
    }

    /**
     * Test of CutDownTree method, of class CutDownTreeControl.
     */
    @Test
    public void testCutDownTree() {
        System.out.println("CutDownTree");
        int paces = 0;
        int angle = 0;
        double treeHeight = 0.0;
        int crevasse = 0;
        CutDownTreeControl instance = new CutDownTreeControl();
        double expResult = 34.6;
        double result;
        result = instance.CutDownTree(paces, angle, treeHeight, crevasse);
        /*assertEquals(expResult, result);*/
        
        
    }

    /**
     * Test of main method, of class CutDownTreeControl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CutDownTreeControl.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
