/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.ProgramController;
import desertescape.DesertEscape;

/**
 *
 * @author doozi
 */
public class MainMenuView extends View{

    

    public MainMenuView() {
        super("\n"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
        boolean valid = true;
        switch (value) {
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "S":
                saveCurrentGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
                break;
            default:
                valid = false;
                System.out.println("Invalid option");
                return valid;
        }
        return valid;
    }


    private void startNewGame() {
        ProgramController.createNewGame(DesertEscape.getPlayer());
        System.out.println("CALLED START NEW GAME - NOT IMPLEMENTED YET");
    }

    private void loadSavedGame() {
        System.out.println("CALLED lOAD SAVED GAME - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

}
