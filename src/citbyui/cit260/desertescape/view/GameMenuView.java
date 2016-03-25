/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import citbyui.cit260.desertescape.control.MovementController;
import desertescape.DesertEscape;
import desertescape.model.Location;

/**
 *
 * @author Garrett
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("========================"
                + "\nN - Run North"
                + "\nE - Run East"
                + "\nS - Run South"
                + "\nW - Run West"
                + "\nI - Inspect"
                + "\nF - Fill Pit"
                + "\nM - Main Menu"
                + "\nD - Display Game Menu"
                + "\nV - View Map"
                + "\nC - Current Location"
                + "\n========================");

    }

    @Override
    public boolean doAction(String value) {

        char charSel = value.toUpperCase().charAt(0);

        switch (charSel) {
            case 'I':
                console.println("NEED TO IMPLEMENT ITEMS AND COLLECTION CONTROLLER");
                break;
            case 'F':
                FillPitView fillPit = new FillPitView();
                fillPit.display();
                break;
            case 'M':
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;
            case 'D':
                GameMenuView desertMenu = new GameMenuView();
                desertMenu.display();
                break;
            case 'V':
                viewMap();
                break;
            case 'N':
                moveNorth();
            case 'E':
                moveEast();
            case 'S':
                moveSouth();
            case 'W':
                moveWest();
            case 'C':
                currentLocation();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
        }
        return false;
    }

    public void viewMap() {
        String map = DesertEscape.getGame().getMap().getMapString();
        console.println(map);
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        mc.moveNorth(DesertEscape.getGame());
        currentLocation();
    }

    private void moveEast() {
        MovementController mc = new MovementController();
        mc.moveEast(DesertEscape.getGame());
        currentLocation();
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        mc.moveSouth(DesertEscape.getGame());
        currentLocation();
    }

    private void moveWest() {
        MovementController mc = new MovementController();
        mc.moveWest(DesertEscape.getGame());
        currentLocation();
    }

    private void currentLocation() {
        Location l = DesertEscape.getGame().getPlayer().getLocation();
        console.println("You are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }

}
