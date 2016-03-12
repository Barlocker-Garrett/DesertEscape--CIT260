/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import desertescape.DesertEscape;

/**
 *
 * @author Garrett
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
    super("========================"
                + "\nRun"
                + "\nInspect"
                + "\nFill Pit"
                + "\nMain Menu"
                + "\nView Map"
                + "\n========================");
   
    }
    
    
    
    @Override
    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'R':
                RunMenuView runMenu = new RunMenuView();
                runMenu.display();
                break;
            case 'I':
                System.out.println("NEED TO IMPLEMENT ITEMS AND COLLECTION CONTROLLER");
                break;
            case 'F':
                System.out.println("CALL THE FILL PIT VIEW");
                break;
            case 'M':
                MainMenuView mainMenu = new MainMenuView();
                    mainMenu.display();
                break;
            case 'V':
                viewMap();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }

    private void viewMap() {
        String map = DesertEscape.getGame().getMap().getMapString();
        System.out.println(map);
    }

}
