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
public abstract class SellMenuView extends View {


    public SellMenuView() {
    super("\n"
            + "\n1 - Sell Item 1"
            + "\n2 - Sell Item 2"
            + "\n3 - Sell Item 3"
            + "\n4 - Sell Item 4"
            + "\n5 - Sell Item 5"
            + "\n6 - Sell Item 6"
            + "\n7 - Sell Item 7"
            + "\n8 - Sell Item 8"
            + "\n9 - Sell Item 9"
            + "\n0 - Sell Item 10");
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
                //add item names to inventory   
    }
    

    private void sellItem1() {
        throw new UnsupportedOperationException("Not supported yet.");
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
