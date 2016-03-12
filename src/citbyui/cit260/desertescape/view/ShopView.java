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
public class ShopView extends View {


    public ShopView() {
    super("\n"
            + "\nBuy - Buy Items"
            + "\nSell - Sell Items"
            + "\nQ - Quit to main");

    }

    /**
     *
     * @param selection
     * @return
     */
    @Override
    public boolean doAction(String selection) {
        boolean valid = true;
        switch (selection) {
            case "Buy":
                buyItems();
                break;
            case "Sell":
                sellItems();
                break;
            case "Q":
                break;
            default:
                System.out.println("Invalid option");
                valid = false;
                return valid;
        }
        return valid;
    }

    @Override
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
        SellMenuView SellMenu = new SellMenuView() {
            @Override
            public boolean doAction(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        sellMenu.displayMenu();    }

    private void sellItems() {
        BuyMenuView BuyMenu = new BuyMenuView() {
            @Override
            public boolean doAction(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        buyMenu.displayMenu();     }
}
