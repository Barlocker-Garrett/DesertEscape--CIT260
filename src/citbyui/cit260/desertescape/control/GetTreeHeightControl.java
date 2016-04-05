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
public class GetTreeHeightControl {


    /**
     *
     * @param paces
     * @param angle
     * @param treeHeight
     * @param crevasse
     * @return
     */
    public static double GetTreeHeight(double paces, double angle, double crevasse)throws Exception {

        double treeHeight = 0.0;

        if (paces >= 300) {
            throw new Exception("You will be too far for a good reading");
        }
        if (angle > 90) {
            throw new Exception("Please get a little further away from the tree");
        }
        if (angle < 1) {
            throw new Exception("The angle must be between 1 and 90");
        }

        double distance = paces * 3;

        treeHeight = (Math.atan(angle)) * distance;

        return treeHeight;
    }

}
