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

    public MainMenuView(){
        super("\n"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
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
            return true;
        default:
            console.println("Invalid option");
            break;
    }
    return false;
}

    private void startNewGame() {
        ProgramController.createNewGame(DesertEscape.getPlayer());
        GameMenuView desertMenu = new GameMenuView();
        desertMenu.display();
    }

    private void loadSavedGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            ProgramController.loadGame(fileName);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void saveCurrentGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            ProgramController.saveGame(fileName);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
