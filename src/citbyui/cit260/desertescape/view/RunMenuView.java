/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

/**
 *
 * @author Garrett
 */
public class RunMenuView extends View{

    public RunMenuView() {
        super("=================="
                + "\nDesert"
                + "\nPyramid"
                + "\nCaves"
                + "\nAlien Camp"
                + "\nCliffs"
                + "\nMountain"
                + "\nShop"
                + "\n==================");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean valid = true;
        System.out.println("Where are you running to: ");
        value = value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
        String location;
        switch (value) {
                    case "D":
                    case "Desert":
                        location = "Desert";
                        break;
                    case "P":
                    case "Pyramid":
                        location = "Pyramid";
                        break;
                    case "Ca":
                    case "Caves":
                        location = "Caves";
                        break;
                    case "A":
                    case "Alien Camp":
                        location = "Alien Camp";
                        break;
                    case "Cl":
                    case "Cliffs":
                        location = "Cliffs";
                        break;
                    case "M":
                    case "Mountain":
                        location = "Mountain";
                        break;
                    case "S":
                    case "Shop":
                        location = "Shop";
                        break;
                    default:
                        System.out.println("That is not a real location, please try again.");
                        valid = false;
                        return valid;
                }
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
         return valid;
        }
    }
