/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

/**
 *
 * @author Garrett
 */
public class BuildTimeMachineControl {
    public int BuildTimeMachine(long weight, long feet, long inch)
    {
        if (weight == 0){
            System.out.println("Weight cannot be zero");
            return 0;
        }
        if (weight == -1){
            System.out.println("Weight cannot be negative");
            return 0;
        }
        if (((feet * 12) + inch) < 0){
            System.out.println("Height cannot be negative");
            return 0;
        }
        if (((feet * 12) + inch) == 0){
            System.out.println("Height cannot be zero");
            return 0;
        }
        double kilogram = weight * 0.45;
        double meter = (feet * 12 + inch) * 0.025;
        double bodyMassIndex = kilogram / (meter * meter);
        
        long neededScrap = (long) (Math.round (bodyMassIndex * 1.5));
        long neededFerriteIron = (long) (Math.round (bodyMassIndex * 0.2));
        long neededCopperWire = (long) (Math.round (bodyMassIndex * 0.1));
        long neededCrystal = 1;
        
        return 1;
    }    
}
