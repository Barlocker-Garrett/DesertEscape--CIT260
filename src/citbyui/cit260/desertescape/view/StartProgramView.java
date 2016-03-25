/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.ProgramController;
import desertescape.DesertEscape;
import desertescape.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Garrett
 */
public class StartProgramView {
    
    protected final PrintWriter console = DesertEscape.getOutFile();
    protected final BufferedReader keyboard = DesertEscape.getInFile();
    
    private static BufferedReader inFile;
    private static PrintWriter outFile;

    public void startProgram(){
        displayBanner();

        String playerName = display();

        Player player = ProgramController.createPlayer(playerName);

        DesertEscape.setPlayer(player);

        doAction(player.getName());

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    public void displayBanner() {

        String welcome;
        welcome = "========================"
                + "\nWelcome to Desert Escape"
                + "\nEnjoy the game."
                + "\n========================";

        console.println(welcome);
    }

    public String display() {
        boolean isValidName = false;
        String name = "";

        console.println("Please enter your name: ");

        while (!isValidName) {
            String input = "";
            try {
                input = keyboard.readLine();
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error on input");
            }

            if (input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                console.println("Input is invalid - name must be at least 2 characters");
            }
        }

        return name;
    }

    public boolean doAction(String playerName) {
        boolean valid = true;
        console.println("=============================");
        console.println("Welcome " + playerName + ".");
        console.println("Hope you have fun!");
        console.println("=============================");
        return valid;

    }

}
