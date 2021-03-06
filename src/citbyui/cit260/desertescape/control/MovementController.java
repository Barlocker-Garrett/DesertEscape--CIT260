/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import desertescape.model.Game;
import desertescape.model.Location;
import desertescape.model.Map;
import static desertescape.model.Map.NUM_COLS;
import static desertescape.model.Map.NUM_ROWS;
import desertescape.model.Player;

/**
 *
 * @author Garrett
 */
public class MovementController {
    
    public void moveNorth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            int currentCol = currentLocation.getCol();
            
            int newRow = NUM_ROWS - 1;
            
            Location newLocation = map.getLocation(newRow, currentCol);
            player.setLocation(newLocation);
        }
        else {
            int currentCol = currentLocation.getCol();
            int currentRow = currentLocation.getRow();
        
            int newRow = currentRow - 1;
            
            Location newLocation = map.getLocation(newRow, currentCol);
            player.setLocation(newLocation);
            
        }
    }
    
    public void moveEast(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == NUM_COLS - 1) {
            player.setLocation(map.getLocation(currentLocation.getRow(), 0 ));
        }
        else {
            player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() + 1));
            
        }
    }
    
    public void moveWest(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            player.setLocation(map.getLocation(currentLocation.getRow(), NUM_COLS - 1 ));
        }
        else {
            player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
            
        }
    }
    
    public void moveSouth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == NUM_ROWS - 1) {
            player.setLocation(map.getLocation(0, currentLocation.getCol()));
        }
        else {
            player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getCol()));
            
        }
    }
}
