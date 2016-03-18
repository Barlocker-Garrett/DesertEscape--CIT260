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
public class FillPitControl {

    public static long FillPit(long shovelFull, long height, long width, long length) {
        double shovelSize = 0.8;
        long gallons;
        gallons = (long) Math.round(height * width * length * 0.133680555556);

        long neededSand = (long) (Math.round(gallons / shovelSize));

        if (neededSand == shovelFull) {
            return neededSand;
        }
        if (shovelFull < 0) {
            return 0;
        }
        if (shovelFull == 0) {
            return 0;
        }
        if (neededSand > shovelFull) {
            return 0;
        }
        if (neededSand < shovelFull) {
            return 0;
        }
        return -1;
    }
}
