/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import citbyui.cit260.desertescape.view.StartProgramView;
import desertescape.model.Game;
import desertescape.model.Item;
import desertescape.model.Player;

/**
 *
 * @author Garrett
 */
public class DesertEscape {
    
    private static Player player;
    private static Game game;
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        
        StartProgramView startProgram = new StartProgramView();
        try {
            // create StartProgram and Start the program
            startProgram.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgram.startProgram();
        }
        
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        DesertEscape.game = game;
    }
    
    
}