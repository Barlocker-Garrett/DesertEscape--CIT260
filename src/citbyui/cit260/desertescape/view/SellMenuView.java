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
public class SellMenuView {

    private final String menu = "\n"
            + "\n1 - Sell Item 1"
            + "\n2 - Sell Item 2"
            + "\n3 - Sell Item 3"
            + "\n4 - Sell Item 4"
            + "\n5 - Sell Item 5"
            + "\n6 - Sell Item 6"
            + "\n7 - Sell Item 7"
            + "\n8 - Sell Item 8"
            + "\n9 - Sell Item 9"
            + "\n0 - Sell Item 10";

    public SellMenuView() {

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
            case '1':
                sellItem1();
                break;
            case '2':
                sellItem2();
                break;
            case '3':
                sellItem3();
                break;
            case '4':
                sellItem4();
                break;
            case '5':
                sellItem5();
                break;
            case '6':
                sellItem6();
                break;
            case '7':
                sellItem7();
                break;
            case '8':
                sellItem8();
                break;
            case '9':
                sellItem9();
                break;
            case '0':
                sellItem0();
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

    private void sellItem1() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem2() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem3() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem4() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem5() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem6() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem7() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem8() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem9() {
        System.out.println("This is where you can sell an item.");
    }

    private void sellItem0() {
        System.out.println("This is where you can sell an item.");
    }
}