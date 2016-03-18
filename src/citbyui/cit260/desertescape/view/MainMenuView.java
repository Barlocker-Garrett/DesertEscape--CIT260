/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.ProgramController;
import desertescape.DesertEscape;
import desertescape.exceptions.MainMenuException;

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
    public void doAction(String value) {
        try {
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
                throw new MainMenuException("Invaid input");
        }
        } catch (MainMenuException me) {
        
        }
    }


    private void startNewGame() {
        ProgramController.createNewGame(DesertEscape.getPlayer());
        GameMenuView desertMenu = new GameMenuView();
        desertMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("CALLED lOAD SAVED GAME - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
