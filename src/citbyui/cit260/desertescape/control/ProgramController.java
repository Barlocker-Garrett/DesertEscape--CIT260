/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import citbyui.cit260.desertescape.view.ErrorView;
import desertescape.DesertEscape;
import desertescape.model.Game;
import desertescape.model.Item;
import desertescape.model.Map;
import desertescape.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garrett
 */
public class ProgramController {

    public static Player createPlayer(String playerName) {

        if (playerName == null) {
            return null;
        }

        Player p = new Player();
        p.setName(playerName);
        return p;

    }

    public static void createNewGame(Player player) {
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        populateMapWithItems(gameMap);
        
        player.setLocation(gameMap.getLocation(0,0));
        
        DesertEscape.setGame(g);
    }
    
    public static void populateMapWithItems(Map map){
        
        List<Item> items = createItemList();
        boolean done = false;
        
        for(Item i : items){
            
            do {
                int row = (int)(Math.random() * Map.NUM_ROWS);
                int col = (int)(Math.random() * Map.NUM_COLS);
                    if (map.getLocation(row,col).getItem() == null) {
                        map.getLocation(row, col).setItem(i);
                        done = true;
                    }
            } while(!done);
        }
        
    }

    public static List<Item> createItemList (){
        
        List<Item> itemList = new ArrayList<>();
        
        Item water = new Item();
        water.setName("Water");
        water.setDescription("Mostly fresh, clean, and clear");
        water.setValue(5);
        itemList.add(water);
        
        Item steak = new Item();
        steak.setName("Steak");
        steak.setDescription("Rare like real men like it");
        steak.setValue(4);
        itemList.add(steak);
        
        Item shirt = new Item();
        shirt.setName("Shirt");
        shirt.setDescription("A shirt if you can call it that, more like rags");
        shirt.setValue(1);
        itemList.add(shirt);
        
        Item knife = new Item();
        knife.setName("Knife");
        knife.setDescription("A knife, if you count butter-knifes");
        knife.setValue(2);
        itemList.add(knife);
        
        Item medicine = new Item();
        medicine.setName("Medicine");
        medicine.setDescription("Improve your health, if hurt, or sick");
        medicine.setValue(4);
        itemList.add(medicine);

        return itemList;
        
    }

    public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(DesertEscape.getGame());
        } catch (Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }

    public static void loadGame(String filePath) {
        Game game = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            DesertEscape.setGame(game);
            DesertEscape.setPlayer(game.getPlayer());
            
        } catch (Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
    
}
