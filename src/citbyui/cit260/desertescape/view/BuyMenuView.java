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
public class BuyMenuView extends View {


    public BuyMenuView() {
   super("\n"
            + "\n1 - Buy Item 1"
            + "\n2 - Buy Item 2"
            + "\n3 - Buy Item 3"
            + "\n4 - Buy Item 4"
            + "\n5 - Buy Item 5"
            + "\n6 - Buy Item 6"
            + "\n7 - Buy Item 7"
            + "\n8 - Buy Item 8"
            + "\n9 - Buy Item 9"
            + "\n0 - Buy Item 10");
    }

    public boolean doAction(char selection) {
        boolean buyItem = false;

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
                return buyItem;
        }
        return buyItem;  //need to add item names to inventory
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
