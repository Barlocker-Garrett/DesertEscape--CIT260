/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author doozi
 */
public class CutDownTreeControl {

    protected final PrintWriter console = DesertEscape.getOutFile();
    protected final BufferedReader keyboard = DesertEscape.getInFile();
    /**
     *
     * @param args
     */
    public void something() {

        double paces = 3.0;
        double angle = 23.5;
        double crevasse = 12.4;

        CutDownTree(paces, angle, crevasse);

        paces = 3.0;
        angle = 23.5;
        crevasse = 12.4;
        CutDownTree(paces, angle, crevasse);
    }

    /**
     *
     * @param paces
     * @param angle
     * @param treeHeight
     * @param crevasse
     * @return
     */
    public double CutDownTree(double paces, double angle, double crevasse) {
        console.println("Please take some steps");
        //return 0;

        double treeHeight = 0.0;

        if (paces >= 300) {
            console.println("You will be too far for a good reading");
        }

        if (angle > 90) {
            console.println("Please get a little further away from the tree");
        }
        if (angle < 1) {
            console.println("The angle must be between 1 and 90");
        }

        if (treeHeight >= 35) {
            console.println("Nicely done, go ahead and cross the crevasse");
            return 1;
        }

        double distance = paces * 3;

        treeHeight = (Math.atan(angle)) * distance;

        return treeHeight;
    }

}
