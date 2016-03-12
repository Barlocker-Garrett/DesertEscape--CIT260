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
    
    public Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
        System.out.println(LocationType.values().length);
    }
    
    public void init() {
        
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location loc = new Location();
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                System.out.println(loc);
                matrix[row][col] = loc;
            }
        }
        Location loc = new Location();
        loc.setType(LocationType.values()[0]);
        matrix[0][0] = loc;
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
