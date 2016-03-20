/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import desertescape.exceptions.FillPitException;

/**
 *
 * @author Garrett
 */
public class FillPitControl {

    public static void FillPit(long shovelFull, long height, long width, long length) {
        double shovelSize = 0.8;
        long gallons;
        gallons = (long) Math.round(height * width * length * 0.133680555556);

        long neededSand = (long) (Math.round(gallons / shovelSize));
        try {
            if (shovelFull < 0) {
                throw new FillPitException("Must be possitive number");
            }
            if (shovelFull == 0) {
                throw new FillPitException("Must be more than 0");
            }
            if (neededSand > shovelFull) {
                throw new FillPitException("You needed more sand");
            }
            if (neededSand < shovelFull) {
                throw new FillPitException("You overfilled the pit");
            }
        } catch (FillPitException fp) {
            System.out.println(fp.getMessage());
        }
        
        if (neededSand == shovelFull) {
                System.out.println("Correct, you filled the pit");
            }
    }
}
