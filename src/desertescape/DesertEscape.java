/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import citbyui.cit260.desertescape.view.StartProgramView;
import desertescape.model.Game;
import desertescape.model.Player;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Garrett
 */
public class DesertEscape {
    
    private static Player player;
    private static Game game;
    
    private static BufferedReader inFile;
    private static PrintWriter outFile;
    
    private static PrintWriter logFile;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = null;
        try {
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            String logPath = "log.txt";
            logFile = new PrintWriter(logPath);
     
            startProgram = new StartProgramView();
            startProgram.startProgram();
        } catch (Exception e) {
            e.printStackTrace();
            startProgram.startProgram();
        } finally {
            try{
                if (inFile != null) {
                    inFile.close();
                }
                if (outFile != null) {
                    outFile.close();
                }
            } catch (Exception ex) {
                System.out.println("Error closing files");
            }
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
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutfile(PrintWriter outFile) {
        DesertEscape.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        DesertEscape.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DesertEscape.logFile = logFile;
    }
    
    
}