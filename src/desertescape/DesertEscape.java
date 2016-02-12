/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import desertescape.model.Game;
import desertescape.model.Item;
import desertescape.model.Player;

/**
 *
 * @author Garrett
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creation of an instance for Player
        Player playerOne = new Player();
        
        playerOne.setName("Joe");
        playerOne.setNumLives(3);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Creation of an instance for Game
        Game gameOne = new Game();
        
        gameOne.setTotalTime(0);
        gameOne.setDifficulty(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Creation of an instance for Item
        Item food = new Item();
        
        food.setName("Agave");
        food.setDescription("Its flowers and flower buds are edible");
        food.setValue(20);
        
        String itemInfo = food.toString();
        System.out.println(itemInfo);
    }
    
}
