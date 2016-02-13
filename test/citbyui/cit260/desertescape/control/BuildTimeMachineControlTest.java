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
public class BuildTimeMachineControlTest {
    
    public BuildTimeMachineControlTest() {
    }

    /**
     * Test of BuildTimeMachine method, of class BuildTimeMachineControl.
     */
    @Test
    public void testBuildTimeMachine() {
        System.out.println("BuildTimeMachine");
        long weight = 150;
        long feet = 4;
        long inch = 2;
        BuildTimeMachineControl instance = new BuildTimeMachineControl();
        int expResult = 1;
        int result = instance.BuildTimeMachine(weight, feet, inch);
        assertEquals(expResult, result);
        
        weight = -1;
        feet = 4;
        inch = 5;
        expResult = 0;
        result = instance.BuildTimeMachine(weight, feet, inch);
        assertEquals(expResult, result);
        
        weight = 0;
        feet = 4;
        inch = 5;
        expResult = 0;
        result = instance.BuildTimeMachine(weight, feet, inch);
        assertEquals(expResult, result);
        
        weight = 150;
        feet = -1;
        inch = 11;
        expResult = 0;
        result = instance.BuildTimeMachine(weight, feet, inch);
        assertEquals(expResult, result);
        
        weight = 250;
        feet = 7;
        inch = 2;
        expResult = 1;
        result = instance.BuildTimeMachine(weight, feet, inch);
        assertEquals(expResult, result);
    }
    
}
