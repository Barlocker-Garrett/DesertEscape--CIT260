/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.control;

import desertescape.model.Player;

/**
 *
 * @author Garrett
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName){
    
        if(playerName == null){
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
        
    }
    
}
