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
public class ShopView {

    private final String menu = "\n"
            + "\nY - Buy Items"
            + "\nS - Sell Items"
            + "\nB - Back to main";

    public ShopView() {

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
            case 'Y':
                buyItems();
                break;
            case 'S':
                sellItems();
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

    private void buyItems() {
        SellMenuView SellMenu = new SellMenuView();
        sellMenu.displayMenu();    }

    private void sellItems() {
        BuyMenuView BuyMenu = new BuyMenuView();
        buyMenu.displayMenu();     }
}
