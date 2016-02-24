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
public class RunMenuView {

    public RunMenuView() {

    }

    public void runMenu() {

        displayLocations();

        String location = getLocation();

        displayLocationMessage(location);

    }

    private void displayLocations() {
        String locations = "";
        locations = "=================="
                + "\nDesert"
                + "\nPyramid"
                + "\nCaves"
                + "\nAlien Camp"
                + "\nCliffs"
                + "\nMountain"
                + "\nShop"
                + "\n==================";
        System.out.println(locations);
    }

    public String getLocation() {
        boolean isValidLocation = false;
        String location = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Where are you running to: ");

        while (!isValidLocation) {
            String input = keyboard.nextLine();
            if (input.isEmpty()) {
            } else {
                input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();

                switch (input) {
                    case "D":
                    case "Desert":
                        isValidLocation = true;
                        location = "Desert";
                        break;
                    case "P":
                    case "Pyramid":
                        isValidLocation = true;
                        location = "Pyramid";
                        break;
                    case "Ca":
                    case "Caves":
                        isValidLocation = true;
                        location = "Caves";
                        break;
                    case "A":
                    case "Alien Camp":
                        isValidLocation = true;
                        location = "Alien Camp";
                        break;
                    case "Cl":
                    case "Cliffs":
                        isValidLocation = true;
                        location = "Cliffs";
                        break;
                    case "M":
                    case "Mountain":
                        isValidLocation = true;
                        location = "Mountain";
                        break;
                    case "S":
                    case "Shop":
                        isValidLocation = true;
                        location = "Shop";
                        break;
                    default:
                        System.out.println("That is not a real location, please try again.");
                        break; 
                }
            }
        }
        return location;
    }

    private void displayLocationMessage(String location) {
        System.out.println("=============================");
        switch (location)
        {
            case "Desert":
                System.out.println("Back to where you started, the desert.");
                break;
            case "Pyramid":
                System.out.println("Glancing around you see the great pyramids.");
                break;
            case "Caves": 
                System.out.println("The cave you found is damp, dark, and oddly enough a bit cozy.");
                break;
            case "Alien Camp":
                System.out.println("Here within the alien camp you might find a needed Crystal.");
                break;
            case "Cliffs":
                System.out.println("You stop running as you shoes almost slip off the edge of a cliff.");
                break;
            case "Mountain":
                System.out.println("After running like a bear you find yourself in the mountains.");
                break;
            case "Shop":  
                System.out.println("The Shop: a nice place to buy and sell items.");
                break;
        }        
        System.out.println("=============================");
    }

}
