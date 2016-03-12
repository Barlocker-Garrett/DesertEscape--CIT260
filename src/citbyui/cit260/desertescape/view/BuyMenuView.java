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
public class BuyMenuView {

    private final String menu = "\n"
            + "\n1 - Buy Item 1"
            + "\n2 - Buy Item 2"
            + "\n3 - Buy Item 3"
            + "\n4 - Buy Item 4"
            + "\n5 - Buy Item 5"
            + "\n6 - Buy Item 6"
            + "\n7 - Buy Item 7"
            + "\n8 - Buy Item 8"
            + "\n9 - Buy Item 9"
            + "\n0 - Buy Item 10";

    public BuyMenuView() {

    }

    public void displayBuyMenu() {

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
                buyItem1();
                break;
            case '2':
                buyItem2();
                break;
            case '3':
                buyItem3();
                break;
            case '4':
                buyItem4();
                break;
            case '5':
                buyItem5();
                break;
            case '6':
                buyItem6();
                break;
            case '7':
                buyItem7();
                break;
            case '8':
                buyItem8();
                break;
            case '9':
                buyItem9();
                break;
            case '0':
                buyItem0();
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

    private void buyItem1() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem2() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem3() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem4() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem5() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem6() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem7() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem8() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem9() {
        System.out.println("This is where you can buy an item.");
    }

    private void buyItem0() {
        System.out.println("This is where you can buy an item.");
    }
}
