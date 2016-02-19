/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import java.util.Scanner;

/**
 *
 * @author doozi
 */
public class HelpMenuView {

    private final String menu = "\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nM - Movement"
            + "\nO - Objective"
            + "\nB - Back to main";

    public HelpMenuView() {

    }

    public void displayMenu() {

        char selection = ' ';

        do {
            System.out.println(menu);

            String input = getInput();
            selection = input.charAt(0);
            doAction(selection);

        } while (selection != 'B');

    }

    public void doAction(char selection) {

        switch (selection) {
            case 'A':
                aboutGame();
                break;
            case 'H':
                howToPlay();
                break;
            case 'M':
                movementHelp();
                break;
            case 'O':
                objective();
                break;
            case 'B':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

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

    private void aboutGame() {
        System.out.println("You're stuck in a desert and you can escape by building time machine for some reason.");
    }

    private void howToPlay() {
        System.out.println("Move from location to location inspecting for items. Run if you think you'll be captured.");
    }

    private void movementHelp() {
        System.out.println("Run - You randomly run to another area. \nShop - Go to shop to buy items");
    }

    private void objective() {
        System.out.println("Don't die, build a time machine and live!");
    }
}
