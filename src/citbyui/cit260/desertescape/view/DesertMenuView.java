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
public class DesertMenuView {
    
    public void desertMenu(){
    boolean run = false;
        while (run != true)
        {
            displayOptions();
            run = getOption();
            
        }          
    }
    
    public void displayOptions(){
        
        String options = "";
        options = "========================"
                + "\nRun"
                + "\nInspect"
                + "\nFill Pit"
                + "\nMain Menu"
                + "\n========================";
        System.out.println(options);
    }
    
    public boolean getOption(){
        
        boolean run = false; 
        boolean isValidOption = false;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What would you like to do?");
        
        while (!isValidOption)
        {
            String input = keyboard.nextLine();
            if (input.isEmpty()){
            }
            else {
                input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
                if ("R".equals(input) || "Run".equals(input))
                {
                    run = true;
                    RunMenuView runMenu = new RunMenuView();
                        runMenu.runMenu();
                }
                else if ("I".equals(input) || "Inspect".equals(input))
                    System.out.println("NEED TO IMPLEMENT ITEMS AND COLLECTION CONTROLLER");
                else if ("F".equals(input) || "Fill pit".equals(input))
                    System.out.println("CALL THE FILL PIT VIEW");
                else if ("M".equals(input) || "Main menu".equals(input))
                {
                    MainMenuView mainMenu = new MainMenuView();
                    mainMenu.display();
                }
            }
            
        }    
        return run;
    }
}
