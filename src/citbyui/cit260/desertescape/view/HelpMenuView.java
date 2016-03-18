/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import desertescape.exceptions.MainMenuException;

/**
 *
 * @author doozi
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nM - Movement"
            + "\nO - Objective"
            + "\nB - Back to main");
    }

    @Override
    public void doAction(String value) {
        try {
        switch (value) {
            case "A":
                aboutGame();
                break;
            case "H":
                howToPlay();
                break;
            case "M":
                movementHelp();
                break;
            case "O":
                objective();
                break;
            case "B":
                break;
            default:
                throw new MainMenuException("Invaid option");
        }
        } catch (MainMenuException me) {}
        
    }

    private void aboutGame() {
        System.out.println("You're stuck in a desert and you can escape by building time machine for some reason.");
    }

    private void howToPlay() {
        System.out.println("Move from location to location inspecting for items. Run if you think you'll be captured.");
    }

    private void movementHelp() {
        System.out.println("Run - You randomly run to another area. \nShop - Go to shop to buy items");
    }

    private void objective() {
        System.out.println("Don't die, build a time machine and live!");
    }
}
