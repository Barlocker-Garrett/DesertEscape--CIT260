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

    public long FillPit(long shovelFull, long height, long width, long length) {
        double shovelSize = 0.8;
        //height = (long) (Math.random() * 100 + 5);

        //width = (long) (Math.random() * 100 + 5);
        //length = (long) (Math.random() * 100 + 5);
        long gallons;
        gallons = (long) Math.round(height * width * length * 0.133680555556);

        if (shovelSize == 0.8) {
            System.out.println("The pit is " + gallons + " gallons how many shovel"
                    + " fulls, will it take? \nUsing a 0.8 gallon shovel.");
        }

        long neededSand = (long) (Math.round(gallons / shovelSize));
        //Scanner in = new Scanner(System.in);
        /*long*/
        //shovelFull = (long) (Math.round(in.nextDouble()));

        if (neededSand == shovelFull) {
            System.out.println("You filled the pit, perfectly.");
            return neededSand;
        }
        if (shovelFull < 0) {
            System.out.println("You cannot have negative shovel fulls");
            return 0;
        }
        if (shovelFull == 0) {
            System.out.println("You cannot have zero shovel fulls");
            return 0;
        }
        if (neededSand > shovelFull) {
            System.out.println("You needed to fill the pit with more sand.");
            return 0;
        }
        if (neededSand < shovelFull) {
            System.out.println("You over filled the pit");
            return 0;
        }
        return -1;
    }
}
