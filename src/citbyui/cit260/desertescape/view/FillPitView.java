/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.FillPitControl;
import java.util.Scanner;

/**
 *
 * @author Garrett
 */
public class FillPitView extends View{
    
    public FillPitView() {
        super("You need to cross the pit");
    }
    
    @Override
    public void doAction(String value) {
        long height;
        height = ((long) (1 + Math.random() * 100));
        long width;
        width = ((long) (1 + Math.random() * 100));
        long length;
        length = ((long) (1 + Math.random() * 100));
        System.out.println("Which is " + height + " feet deep"
                           + "\n" + width + " feet wide and"
                           + "\n" + length + " feet long");
        System.out.println("With a shovel that can scoop 0.8 gallons" +
                         "\nHow many scoops will it take to fill the pit?" +
                         "\nHint: Constant to convert cubic feet to gallons is:" +
                         "~0.13368");
        long shovelFull = (long) getDouble();
        FillPitControl.FillPit(shovelFull, height, width, length);
    }
    
    @Override
        public String getInput() {
        return "Fill Pit";
    }
    
    @Override
        public double getDouble() {
        Scanner keyboard = new Scanner(System.in);
        double input = 0.0;

            try {
                input = keyboard.nextDouble();
            } catch (NumberFormatException nf) {
                System.out.println("Invalid input - please enter a valid number" +
                                    "Try again or enter Q to quit.");
        }
        return input;
    }
    
}
