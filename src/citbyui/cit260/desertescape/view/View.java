/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Garrett
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    protected final PrintWriter console = DesertEscape.getOutFile();
    protected final BufferedReader keyboard = DesertEscape.getInFile();
    
    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        console.println(this.displayMessage);
        boolean done = false;
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            // do the requested action and display the next view
            //done = this.doAction(value);
            
        } while (!done); // exit the view when done == true
    }
    
    @Override
        public String getInput() {
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            console.println("Please select an option: ");
            try {
                input = keyboard.readLine();
            } catch (Exception e) {
                throw new RuntimeException("Error reading input");
            }
            input = input.trim();

            if (input == null || input.length() == 0) {
                console.println("Invalid input - please enter a valid character");
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
                console.println("Invalid input - please enter a valid number" +
                                    "Try again or enter Q to quit.");
            }

        }
        return input;
    }
   
}
