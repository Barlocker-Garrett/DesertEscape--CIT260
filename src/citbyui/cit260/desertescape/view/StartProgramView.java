/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.ProgramController;
import desertescape.DesertEscape;
import desertescape.model.Player;
import java.util.Scanner;

/**
 *
 * @author Garrett
 */
public class StartProgramView {

    public StartProgramView() {

    }

    public void startProgram() {

        displayBanner();

        String playerName = getPlayerName();

        Player player = ProgramController.createPlayer(playerName);

        DesertEscape.setPlayer(player);

        displayWelcomeMessage(player.getName());

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    public void displayBanner() {
        String welcome = "";
        welcome = "========================"
                + "\nWelcome to Desert Escape"
                + "\nEnjoy the game."
                + "\n========================";

        System.out.println(welcome);
    }

    public String getPlayerName() {

        boolean isValidName = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        while (!isValidName) {
            String input = keyboard.nextLine();

            if (input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
            }
        }

        return name;
    }

    public void displayWelcomeMessage(String playerName) {

        System.out.println("=============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Hope you have fun!");
        System.out.println("=============================");

    }

}
