/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import java.util.Scanner;

/**
 *
 * @author Garrett
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            // prompt for and get players name
            String value = this.getInput();

            doAction(value);

            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the view
            }
            // do the requested action and display the next view
            //done = this.doAction(value);

        } while (!done); // exit the view when done == true
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

        System.out.println(this.displayMessage);

        while (!isValid) {
            System.out.println("Please select an option: ");
            input = keyboard.nextLine();
            input = input.trim();

            if (input == null || input.length() == 0) {
                System.out.println("Invalid input - please enter a valid character");
            } else {
                isValid = true;
            }
        }

        return input.toUpperCase();
    }

    @Override
    public double getDouble() {
        Scanner keyboard = new Scanner(System.in);
        double input = 0.0;
        boolean isValid = false;

        while (!isValid) {
            try {
                input = keyboard.nextDouble();
            } catch (NumberFormatException nf) {
                System.out.println("Invalid input - please enter a valid number"
                        + "Try again or enter Q to quit.");
            }

        }
        return input;
    }

}
