/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import java.util.Scanner;

/**
 *
 * @author Garrett
 */
public class DesertMenuView extends View {
    
    public DesertMenuView(){
    super("========================"
                + "\nRun"
                + "\nInspect"
                + "\nFill Pit"
                + "\nMain Menu"
                + "\n========================");
    
    }
    
    
    
    @Override
    public boolean doAction(String value) {
        boolean run = false;
        switch (value) {
            case "Run":
                run = true;
                RunMenuView runMenu = new RunMenuView();
                runMenu.display();
                break;
            case "Inspect":
                System.out.println("NEED TO IMPLEMENT ITEMS AND COLLECTION CONTROLLER");
                break;
            case "Fill Pit":
                System.out.println("CALL THE FILL PIT VIEW");
                break;
            case "Main Menu":
                MainMenuView mainMenu = new MainMenuView();
                    mainMenu.display();
                break;
            default:
                run = false;
                System.out.println("Invalid option");
                return run;
        }
        return run;
    }

}
