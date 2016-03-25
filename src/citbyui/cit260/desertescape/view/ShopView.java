/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

/**
 *
 * @author doozi
 */
public class ShopView extends View {

    public ShopView() {
        super("\n"
                + "\nBuy - Buy Items"
                + "\nSell - Sell Items"
                + "\nView - View Inventory"
                + "\nQ - Quit to main");

    }

    /**
     *
     * @param selection
     * @return
     */
    @Override
    public boolean doAction(String selection) {
        switch (selection) {
            case "Buy":
                buyItems();
                break;
            case "Sell":
                sellItems();
                break;
            case "View":
                viewInventory();
                break;
            case "Q":
                return true;
                default:
                console.println("Invalid option");
                break;
        }
        return false;
}

    @Override
    public String getInput() {
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            try {
                console.println("Please select an option: ");
                input = keyboard.readLine();
                input = input.trim();
                
                if (input == null || input.length() == 0) {
                    console.println("Invalid input - please enter a valid character");
                } else {
                    isValid = true;
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error on input");
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
    }

    private void sellItems() {
        BuyMenuView BuyMenu = new BuyMenuView() {
            @Override
            public boolean doAction(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        buyMenu.displayMenu();
    }

    private void viewInventory() {
        String numItem0 = null;
        console.println("You have :" + numItem0);
        String numItem1 = null;
        console.println("You have :" + numItem1);
        String numItem2 = null;
        console.println("You have :" + numItem2);
        String numItem3 = null;
        console.println("You have :" + numItem3);
        String numItem4 = null;
        console.println("You have :" + numItem4);
    }

}
