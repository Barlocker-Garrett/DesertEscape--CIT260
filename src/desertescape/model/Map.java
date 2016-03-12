/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape.model;

import java.io.Serializable;

/**
 *
 * @author Garrett
 */
public class Map implements Serializable {
    
    //class instance variables
    public static final int NUM_ROWS = 5;
    public static final int NUM_COLS = 5;
    
    private Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
    }
    
    public void init() {
        Location loc = new Location();
        loc.setType(LocationType.values()[0]);
        matrix[0][0] = loc;
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 1; col < NUM_COLS; col++) {
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                
                matrix[row][col] = loc;
            }
        }
    }
    
    public String getMapString() {
        String rtn = "";
        
        for (int row = 0; row < NUM_ROWS; row++){
            for (int col = 0; col < NUM_COLS; col++){
                rtn += matrix[row][col].getType().name().charAt(0);
                
                if(matrix[row][col].getItem() != null){
                    rtn += matrix[row][col].getItem().getName().charAt(0);
                }
                rtn += "\t";
            }
            rtn += "\n";
        }
        
        return rtn;
    }
    
    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }

}
