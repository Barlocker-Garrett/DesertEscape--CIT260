/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.GetTreeHeightControl;
import java.util.Scanner;

/**
 *
 * @author doozi
 */
public class CutDownTreeView {

    private final static String instructions = "\n"
            + "\nA crevasse is between you and the goal. Cross it."
            + "\nYou have a saw and you see plenty of trees that might "
            + "\nbe long enough to make a bridge across. "
            + "\nThe crevasse looks like it is around 30 feet long, so "
            + "\nyou decide to cut a tree down to build a bridge."
            + "\nUsing what you learned in math class, choose a tree"
            + "\nthat will be long enough to make it across.";
    private static final int crevasse = 30;

    public static void CutDownTree() {
        System.out.println(instructions);
        System.out.println("Please enter the number of paces you want to"
                + "\n walk away from the tree");
        Scanner keyboard = new Scanner(System.in);
        int paces = keyboard.nextInt();
        System.out.println("At what angle are you looking"
                + " at the top of the tree?");
        double angle = keyboard.nextDouble();
        try {
            double height = GetTreeHeightControl.GetTreeHeight(paces, angle, crevasse);
            if (height >= crevasse) {
                System.out.println("Nicely done, go ahead and cross the crevasse");
            } else {
                System.out.println("Nope! Try again foo!");
            }
        } catch (Exception generic) {
            System.out.println(generic.getMessage());
        }
         
    }
}
