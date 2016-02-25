/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

/**
 *
 * @author doozi
 */
public class CutDownTreeControl {

    public static void main(String[] args) {

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
    public static double CutDownTree(double paces, double angle, double crevasse) {
        System.out.println("Please take some steps");
        //return 0;

        double treeHeight = 0.0;

        if (paces >= 300) {
            System.out.println("You will be too far for a good reading");
        }

        if (angle > 90) {
            System.out.println("Please get a little further away from the tree");
        }
        if (angle < 1) {
            System.out.println("The angle must be between 1 and 90");
        }

        if (treeHeight >= 35) {
            System.out.println("Nicely done, go ahead and cross the crevasse");
            return 1;
        }

        double distance = paces * 3;

        treeHeight = (Math.atan(angle)) * distance;

        return treeHeight;
    }

}
