/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertescape.view;

import desertescape.DesertEscape;
import java.io.PrintWriter;

/**
 *
 * @author Garrett
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = DesertEscape.getOutFile();
    private static final PrintWriter logFile = DesertEscape.getLogFile();
    
    public static void display(String className, String errorMsg) {
        errorFile.println("---------------------------" +
                "\nERROR: " + errorMsg +
                "\n---------------------------");
        
        logFile.println(className + " - " + errorMsg);
        logFile.flush();
    }
    
}
